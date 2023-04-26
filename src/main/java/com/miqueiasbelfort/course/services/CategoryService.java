package com.miqueiasbelfort.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miqueiasbelfort.course.entities.Category;
import com.miqueiasbelfort.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	// Get All Categorys
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//Get the Category by id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
