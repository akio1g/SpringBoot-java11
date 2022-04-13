package com.example.akio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.akio.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
