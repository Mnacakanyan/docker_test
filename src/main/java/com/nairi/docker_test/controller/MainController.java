package com.nairi.docker_test.controller;

import com.nairi.docker_test.kafka.UserProducer;
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
    private final UserProducer userProducer;

    public MainController(UserService userService, UserProducer userProducer) {
        this.userService = userService;
        this.userProducer = userProducer;

    }

    @GetMapping("/create/{name}")
    public String createUser(@PathVariable String name) {
        userService.save(new User(name));
        userProducer.sendUserCreatedMessage(name);
        return "User saved: " + name;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }
}
