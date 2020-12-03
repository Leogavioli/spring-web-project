package com.javalearning.maven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearning.maven.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//Standard JPA Repository methods from class
}
