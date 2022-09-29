package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.RestaurantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RestaurantService {

	
	private RestaurantRepository repo;
	
	
	public Restaurant add(Restaurant entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Restaurant> findAll(){
		
		return this.repo.findAll();
	}
	
	public Restaurant findById(int id) {
		
		String message = "Element With "+ id +"Not Found";
		
		return this.repo.findById(id).orElseThrow(() -> new RuntimeException(message));
	}
}
