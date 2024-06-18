package com.user.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
Optional<User> findByEmail(String email);

}