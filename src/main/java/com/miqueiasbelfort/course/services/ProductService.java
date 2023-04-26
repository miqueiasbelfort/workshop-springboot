package com.miqueiasbelfort.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miqueiasbelfort.course.entities.Product;
import com.miqueiasbelfort.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	// Get All Products
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//Get the Product by id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
