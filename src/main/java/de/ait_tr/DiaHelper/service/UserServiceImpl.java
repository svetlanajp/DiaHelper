package de.ait_tr.DiaHelper.service;

import de.ait_tr.DiaHelper.domain.entity.User;
import de.ait_tr.DiaHelper.exception_handling.exceptions.UserNotFoundException;
import de.ait_tr.DiaHelper.repository.UserRepository;
import de.ait_tr.DiaHelper.service.interfaces.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        if (id == null || id < 1) {
            throw new UserNotFoundException(id);
        }
        User user = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
