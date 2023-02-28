package com.pivo.workShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivo.workShop.entities.Product;
import com.pivo.workShop.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;	

	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		 Optional<Product> obj = productRepository.findById(id);
		 return obj.get();	 
	}
}
