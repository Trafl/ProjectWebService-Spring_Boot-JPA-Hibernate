package com.pivo.workShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pivo.workShop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
