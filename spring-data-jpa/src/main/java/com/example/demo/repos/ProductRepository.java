package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByProductName(String qryString);
	
	@Query(value = "from Product where ratePerUnit>:srch",nativeQuery = false)
	public List<Product> getProjectByRate(@Param("srch") double rate);
}
