package de.ait_tr.DiaHelper.controller;

import de.ait_tr.DiaHelper.domain.dto.UserDto;
import de.ait_tr.DiaHelper.domain.entity.User;
import de.ait_tr.DiaHelper.service.interfaces.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id){
        return service.getUserById(id);
    }

    @PostMapping
    public UserDto save(@RequestBody UserDto user){
        return service.save(user);}
}
