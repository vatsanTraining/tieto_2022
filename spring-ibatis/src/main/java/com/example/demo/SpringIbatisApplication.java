package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

@SpringBootApplication
public class SpringIbatisApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(SpringIbatisApplication.class, args);
	
	  Customer obj = ctx.getBean(Customer.class);
	    obj.setCustomerId(7899);
	    obj.setCustomerName("Kavin Raj");
	    obj.setEmail("kavin@abc.com");
	  
	    CustomerService service =ctx.getBean(CustomerService.class);
	   
	    System.out.println("Is Added :="+ service.save(obj));

	  service.findAll().forEach(System.out::println);
	
	 ctx.close();
	}

}
