package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx =SpringApplication.run(SpringJdbcApplication.class, args);
	
	  Customer obj = ctx.getBean(Customer.class);
	  
	    obj.setCustomerId(Integer.parseInt(args[0]));
	    obj.setCustomerName(args[1]);
	    obj.setEmail(args[2]);
	
	  CustomerService service = ctx.getBean(CustomerService.class);
	  
	   System.out.println("Is Added :="+ service.save(obj));
	   
	 
	 ctx.close();
	
	}

}
