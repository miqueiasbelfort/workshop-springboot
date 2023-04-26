package com.miqueiasbelfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miqueiasbelfort.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
