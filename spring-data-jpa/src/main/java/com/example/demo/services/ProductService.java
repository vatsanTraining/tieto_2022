package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Service
public class ProductService {

	
	private ProductRepository repo;

	@Autowired
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Product save(Product entity) {
		
		return this.repo.save(entity);
	}
	
	
	public List<Product> findAll(){
		
		return this.repo.findAll();
	}
	
	
   public List<Product> findByProductName(String srchString){
		
		return this.repo.findByProductName(srchString);
	}
	
}
