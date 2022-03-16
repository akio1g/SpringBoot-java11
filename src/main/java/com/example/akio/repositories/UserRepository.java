package com.example.akio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.akio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
