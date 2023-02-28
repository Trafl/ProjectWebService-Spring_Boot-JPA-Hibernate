package com.pivo.workShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pivo.workShop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
