package de.ait_tr.DiaHelper.controller;

import de.ait_tr.DiaHelper.domain.entity.User;
import de.ait_tr.DiaHelper.service.interfaces.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public User getById(Long id){
        return service.getUserById(id);
    }



}