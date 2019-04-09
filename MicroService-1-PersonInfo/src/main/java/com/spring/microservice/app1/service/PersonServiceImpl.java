package com.spring.microservice.app1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservice.app1.model.Person;

@Service
public class PersonServiceImpl {

	@Autowired
	private PersonService personService;
	
	public List<Person> findAllPerson(){
		return (List<Person>) personService.findAll();
	}

	public Optional<Person> findPersonById(int id) {
		// TODO Auto-generated method stub
		return personService.findById(id);
	}
	
}
