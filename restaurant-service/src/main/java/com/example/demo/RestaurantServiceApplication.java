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
	 RestaurantService service = ctx.getBean(RestaurantService.class);

	 int key=6;
	 
	 switch (key) {
	case 1:
		service.findAll().forEach(System.out::println);
		break;
	case 2:
		 System.out.println(service.findById(20303));
		break;
	case 3:
		 System.out.println(service.remove(20303));
       break;
	case 4:
		Restaurant objToUpdate = ctx.getBean("updateBean",Restaurant.class);
		System.out.println(service.update(objToUpdate));
		break;
	case 5:
		service.findByName("Adigas").forEach(System.out::println);
		break;
	case 6:
		service.fetchUsingLocation("Mangalore").forEach(System.out::println);
		break;
	default:
		break;
	}
	 
	 
	 ctx.close();
	
	}

	@Bean
	public Restaurant updateBean() {
		
	return new Restaurant(40303, "Geetham", "chennai", 4.4, LocalDate.of(2022, 12,21));
		
	}
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			RestaurantRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new Restaurant(40303, "Sangeetha", "chennai", 4.4, LocalDate.of(2012, 12,21)));
				repo.save(new Restaurant(50303, "Adigas", "Mangalore", 4.6, LocalDate.of(2014, 12,24)));
				
							
			}
		};
	}
}
