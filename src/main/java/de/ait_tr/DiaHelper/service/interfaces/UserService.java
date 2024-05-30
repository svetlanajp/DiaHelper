package de.ait_tr.DiaHelper.service.interfaces;

import de.ait_tr.DiaHelper.domain.dto.UserDto;
import de.ait_tr.DiaHelper.domain.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(User user);
    User getUserById(Long id);
    User update(User user);
    void deleteById(Long id);
    User register(UserDto userDto);
}
