package com.nairi.docker_test.repository;

import com.nairi.docker_test.repository.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MainRepository {
    
    public MainRepository() {
    }
    
    public List<User> getUsers(){
        return List.of(
                new User("Nairi", "test@test.com"),
                new User("James", "test1@test.com"),
                new User("Arnold", "test2@test.com"),
                new User("Emma", "test3@test.com"),
                new User("Michael", "test4@test.com"),
                new User("Sarah", "test5@test.com"),
                new User("David", "test6@test.com"),
                new User("Lisa", "test7@test.com"),
                new User("John", "test8@test.com"),
                new User("Maria", "test9@test.com"),
                new User("Robert", "test10@test.com"),
                new User("Anna", "test11@test.com"),
                new User("William", "test12@test.com")
        );
    }
}
