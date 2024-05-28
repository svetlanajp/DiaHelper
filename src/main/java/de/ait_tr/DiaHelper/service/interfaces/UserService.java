package de.ait_tr.DiaHelper.service.interfaces;

import de.ait_tr.DiaHelper.domain.dto.UserDto;
import de.ait_tr.DiaHelper.domain.entity.User;

import java.util.List;

public interface UserService {

    UserDto save(UserDto user);
    UserDto getUserById(Long id);
    List<UserDto> getAllActiveUsers();
    UserDto update(UserDto user);
    void deleteById(Long id);
}
