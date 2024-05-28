package de.ait_tr.DiaHelper.service;

import de.ait_tr.DiaHelper.domain.dto.UserDto;
import de.ait_tr.DiaHelper.domain.entity.User;
import de.ait_tr.DiaHelper.exception_handling.exceptions.UserAlreadyExistsException;
import de.ait_tr.DiaHelper.exception_handling.exceptions.UserNotFoundException;
import de.ait_tr.DiaHelper.repository.UserRepository;
import de.ait_tr.DiaHelper.service.interfaces.UserService;
import de.ait_tr.DiaHelper.service.mapping.UserMappingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;
    private UserMappingService mappingService;


    public UserServiceImpl(UserRepository repository, UserMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    @Override
    public UserDto save(UserDto user) {
        User entity = mappingService.mapDtoToEntity(user);
        //???добавить исключение если неправильные данные добавлять

        if (repository.existsByEmail(user.getEmail())) {
            throw new UserAlreadyExistsException("User with email already exists");
        }
        repository.save(entity);

        return mappingService.mapEntityToDto(entity);
    }

    @Override
    public UserDto getUserById(Long id) {
        if (id == null || id < 1) {
            throw new UserNotFoundException(id);
        }
        User user = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return mappingService.mapEntityToDto(user);
    }

    @Override
    public List<UserDto> getAllActiveUsers() {
        return repository.findAll().stream()
                .map(mappingService::mapEntityToDto)
                .toList();
    }

    @Override
    @Transactional
    public UserDto update(UserDto user) {
        User entity = repository.findById(user.getId()).orElseThrow(() -> new UserNotFoundException(user.getId()));
        entity.setGlucoseLevel(user.getGlucoseLevel());
        entity.setHeight(user.getHeight());
        entity.setWeight(user.getWeight());
        entity.setAge(user.getAge());

        return mappingService.mapEntityToDto(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        User entity = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        entity.setActive(false);
    }
}
