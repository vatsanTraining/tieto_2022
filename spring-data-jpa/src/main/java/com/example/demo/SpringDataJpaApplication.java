package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx=SpringApplication.run(SpringDataJpaApplication.class, args);
	
	   Product obj = ctx.getBean(Product.class);
	   
	   ProductService service = ctx.getBean(ProductService.class);
	   
	  // System.out.println("One Product with Following Details Added :="+service.save(obj));
	 
	   service.findAll().forEach(System.out::println);
	   
	 ctx.close();
	}

	
	@Bean
	public Product phone() {
		
		return new Product(102, "Iphone", 63000);
	}
}
