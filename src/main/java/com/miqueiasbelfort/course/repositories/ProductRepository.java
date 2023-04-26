package com.miqueiasbelfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miqueiasbelfort.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
