package com.miqueiasbelfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miqueiasbelfort.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
