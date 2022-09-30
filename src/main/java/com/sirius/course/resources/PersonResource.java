package com.sirius.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirius.course.entities.Person;

@RestController
@RequestMapping(value = "/users")
public class PersonResource {
	
	@GetMapping
	public ResponseEntity<Person> findAll() {
		Person u = new Person(1L, "Maria", "maaria@gmail.com", "9999999", "12345pass");
		return ResponseEntity.ok().body(u);
	}
}
