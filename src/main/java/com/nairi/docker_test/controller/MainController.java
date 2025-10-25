package com.nairi.docker_test.controller;

import com.nairi.docker_test.repository.model.User;
import com.nairi.docker_test.service.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String initial() {
        return "Initial Page";
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello Docker!");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        var users = mainService.getUsers();
        return ResponseEntity.ok(users);
    }
}
