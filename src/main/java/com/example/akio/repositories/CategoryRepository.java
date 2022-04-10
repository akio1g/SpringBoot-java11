package com.example.akio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.akio.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
