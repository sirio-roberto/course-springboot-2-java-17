package com.sirius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
