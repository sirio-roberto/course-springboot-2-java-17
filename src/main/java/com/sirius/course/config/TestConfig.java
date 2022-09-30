package com.sirius.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sirius.course.entities.User;
import com.sirius.course.repositories.PersonRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
		User p1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User p2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		personRepository.saveAll((Arrays.asList(p1, p2)));
	}
	
	
}
