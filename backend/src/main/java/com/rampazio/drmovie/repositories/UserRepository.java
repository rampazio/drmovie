package com.rampazio.drmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rampazio.drmovie.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
