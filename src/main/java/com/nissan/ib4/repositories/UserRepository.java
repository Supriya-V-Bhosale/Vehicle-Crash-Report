package com.nissan.ib4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nissan.ib4.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	

}
