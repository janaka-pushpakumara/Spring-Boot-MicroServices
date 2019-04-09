package com.spring.microservice.app1.service;

import org.springframework.data.repository.CrudRepository;

import com.spring.microservice.app1.model.Person;

public interface PersonService extends CrudRepository<Person, Integer> {

}
