package com.miqueiasbelfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miqueiasbelfort.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
