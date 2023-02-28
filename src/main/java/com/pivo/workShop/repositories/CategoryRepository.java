package com.pivo.workShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pivo.workShop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
