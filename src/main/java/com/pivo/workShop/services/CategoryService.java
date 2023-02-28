package com.pivo.workShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivo.workShop.entities.Category;
import com.pivo.workShop.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository;	

	public List<Category> findAll(){
		return userRepository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category> obj = userRepository.findById(id);
		 return obj.get();	 
	}
}
