package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.RestaurantRepository;
import com.example.demo.services.RestaurantService;

@SpringBootApplication
public class RestaurantServiceApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(RestaurantServiceApplication.class, args);
	
	  ctx.getBean(RestaurantService.class).findAll().forEach(System.out::println);
	  
	 
	 ctx.close();
	
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			RestaurantRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new Restaurant(20303, "Udupi Upahar", "chennai", 4.7, LocalDate.of(2009, 12,12)));
				repo.save(new Restaurant(30303, "Woodlands", "Mangalore", 4.8, LocalDate.of(2010, 2,14)));
				
							
			}
		};
	}
}
