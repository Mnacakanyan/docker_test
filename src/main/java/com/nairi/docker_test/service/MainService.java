package com.nairi.docker_test.service;

import com.nairi.docker_test.repository.UserRepository;
import com.nairi.docker_test.repository.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    private final UserRepository userRepository;

    public MainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
