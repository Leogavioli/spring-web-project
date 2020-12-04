package com.javalearning.maven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearning.maven.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	//Standard JPA Repository methods from class
}
