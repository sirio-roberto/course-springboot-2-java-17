package com.sirius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
