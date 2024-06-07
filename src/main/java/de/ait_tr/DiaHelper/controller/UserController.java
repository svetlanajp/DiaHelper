package de.ait_tr.DiaHelper.controller;

import de.ait_tr.DiaHelper.domain.dto.UserDto;
import de.ait_tr.DiaHelper.domain.entity.User;
import de.ait_tr.DiaHelper.service.interfaces.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public User getById(@RequestParam Long id) {
        return service.getUserById(id);
    }

    @GetMapping("/{id}/profile")
    public UserDto getUserProfile(@PathVariable Long id) {
        return service.getUserProfile(id);
    }

    @PutMapping("/{id}/updated-user")
    public User updateUser(@RequestBody User updatedUser) {
        return service.update(updatedUser);
    }

}