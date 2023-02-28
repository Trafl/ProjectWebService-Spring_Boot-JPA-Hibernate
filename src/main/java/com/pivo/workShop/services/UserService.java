package com.pivo.workShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.pivo.workShop.entities.User;
import com.pivo.workShop.repositories.UserRepository;
import com.pivo.workShop.services.exceptions.DatabaseException;
import com.pivo.workShop.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;	

	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		 Optional<User> obj = userRepository.findById(id);
		 return obj.orElseThrow(()-> new ResourceNotFoundException(id));	 
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		try{
			userRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
			
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User updata(Long id, User obj) {
		try {
		User entity = userRepository.getReferenceById(id);
		updateData(entity , obj);
		return userRepository.save(entity);
		
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setEmail(obj.getEmail());
	}
}
