package com.pivo.workShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pivo.workShop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
