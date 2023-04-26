package com.miqueiasbelfort.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miqueiasbelfort.course.entities.Category;
import com.miqueiasbelfort.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories") //The path of Route
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping //Method GET
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //The {id} is a parameter
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
