package com.javalearning.maven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearning.maven.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	//Standard JPA Repository methods from class
}
