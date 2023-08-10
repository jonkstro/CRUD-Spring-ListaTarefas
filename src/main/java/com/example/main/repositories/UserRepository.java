package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
