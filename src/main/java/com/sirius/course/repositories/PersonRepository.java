package com.sirius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.course.entities.User;

public interface PersonRepository extends JpaRepository<User, Long>{

}
