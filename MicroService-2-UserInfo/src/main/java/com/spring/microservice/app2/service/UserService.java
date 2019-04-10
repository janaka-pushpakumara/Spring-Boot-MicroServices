package com.spring.microservice.app2.service;

import org.springframework.data.repository.CrudRepository;


import com.spring.microservice.app2.model.User;

public interface UserService extends CrudRepository<User, Integer> {

}
