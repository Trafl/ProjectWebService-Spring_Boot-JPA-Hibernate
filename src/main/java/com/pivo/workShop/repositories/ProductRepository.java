package com.pivo.workShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pivo.workShop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
