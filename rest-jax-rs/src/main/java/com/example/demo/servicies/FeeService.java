package com.example.demo.servicies;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Fee;
import com.example.demo.repos.FeeRepository;

public class FeeService {

	private FeeRepository repo= null;
	
	public FeeService() {
		super();
		
		this.repo = new FeeRepository();
	}

	
	public Fee add(Fee entity) {
		
		return this.repo.add(entity)==1?entity:null;
	}
	
	public List<Fee> findAll(){
		
		return this.repo.findAll();
	}
	
    public Optional<Fee> findById(int key){
		
		return this.repo.findById(key);
	}
    
    public int  deleteById(int key){
		
		return this.repo.deleteById(key);
	}
}
