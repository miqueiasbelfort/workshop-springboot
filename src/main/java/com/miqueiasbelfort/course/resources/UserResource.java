package com.miqueiasbelfort.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miqueiasbelfort.course.entities.User;

@RestController
@RequestMapping(value = "/users") //The path of Route
public class UserResource {
	
	@GetMapping //Method GET
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@gmail.com","9999999","123456");
		return ResponseEntity.ok().body(u);
	}
	
}
