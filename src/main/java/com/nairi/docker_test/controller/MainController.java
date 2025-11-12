package com.nairi.docker_test.controller;

import com.nairi.docker_test.repository.UserRepository;
import com.nairi.docker_test.repository.model.User;
import com.nairi.docker_test.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {


    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create/{name}")
    public String createUser(@PathVariable String name) {
        userService.save(new User(name));
        return "User saved: " + name;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }
}
