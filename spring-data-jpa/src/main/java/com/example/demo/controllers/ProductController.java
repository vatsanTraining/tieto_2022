package com.example.demo.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/products")
@AllArgsConstructor
public class ProductController {

	
    private ProductService service;
    
    
    @GetMapping
    public List<Product> findAll(){
    	
    	return this.service.findAll();
    }
    
    @GetMapping(path = "/byPrice")
    public List<Product> findByRateGrtThan(@RequestParam("rate") double rate){
    	
    	return this.service.findByRatePerUnitGrtThan(rate);
    }

    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product entity) throws URISyntaxException{
    	
    	   Product added=   this.service.save(entity);
    	      
    	   return ResponseEntity.
    			    created(new URI("/api/v1/products/"+added.getId()))
    			    .body(added);
    	   
    }
}
