package com.ucare.webucare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ucare.webucare.model.User;

public interface Pacientes extends JpaRepository<User, Long>{
	
}
