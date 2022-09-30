package com.sirius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.course.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
