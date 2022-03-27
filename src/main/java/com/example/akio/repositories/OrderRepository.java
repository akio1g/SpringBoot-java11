package com.example.akio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.akio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
