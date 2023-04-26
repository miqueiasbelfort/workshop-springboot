package com.miqueiasbelfort.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miqueiasbelfort.course.entities.Order;
import com.miqueiasbelfort.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	// Get All Users
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//Get the User by id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
