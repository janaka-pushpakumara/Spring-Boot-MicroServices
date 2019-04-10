package com.spring.microservice.app2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.microservice.app2.model.User;

public class UserServiceImpl {

	@Autowired
	private UserService userServie;
	
	public List<User> findAllUser(){
		return (List<User>) userServie.findAll();
	}
	
	public Optional<User> findUserById(int id) {
		return userServie.findById(id);
	}
}
