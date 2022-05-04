package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SecureUser;

public interface UserRepository extends JpaRepository<SecureUser, Integer> {
	SecureUser findByName(String name);
}
