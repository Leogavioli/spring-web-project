package com.javalearning.maven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalearning.maven.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	//Standard JPA Repository methods from class
}
