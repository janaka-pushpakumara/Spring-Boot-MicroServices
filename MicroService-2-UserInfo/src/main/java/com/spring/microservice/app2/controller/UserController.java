package com.spring.microservice.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.microservice.app2.model.Person;
import com.spring.microservice.app2.model.User;
import com.spring.microservice.app2.service.UserServiceImpl;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private final String url = "http://localhost:9091/api/v1/persons/";

	@Autowired
	private UserServiceImpl userServie;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> findAllUsers() {
		return userServie.findAllUser();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserWithPerson findUserById(@PathVariable("id") final int id) {
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject(url + id, Person.class);
		User user = userServie.findUserById(id).get();
		UserWithPerson res = new UserWithPerson();
		res.setUser(user);
		res.setPerson(person);
		System.out.println(res);
		return res;
	}

}

class UserWithPerson {
	Person person;
	User user;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserWithPerson [person=" + person + ", user=" + user + "]";
	}
	

}
