package com.javalearning.maven.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.maven.entities.Category;
import com.javalearning.maven.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	//response entity is a specific type from Spring to return request responses
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> users = service.findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
