package de.ait_tr.DiaHelper.service.interfaces;

import de.ait_tr.DiaHelper.domain.entity.User;

public interface UserService {

    User save(User user);
    User getUserById(Long id);
    User update(User user);
    void deleteById(Long id);
}
