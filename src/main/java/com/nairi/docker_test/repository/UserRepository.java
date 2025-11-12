package com.nairi.docker_test.repository;

import com.nairi.docker_test.repository.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
