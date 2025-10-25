package com.nairi.docker_test.service;

import com.nairi.docker_test.repository.MainRepository;
import com.nairi.docker_test.repository.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    private final MainRepository mainRepository;

    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public List<User> getUsers(){
        return mainRepository.getUsers();
    }

}
