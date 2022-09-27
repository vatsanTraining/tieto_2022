package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import org.demo.module1.*;
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","org.demo.module1"})
public class QuickstartApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx =SpringApplication.run(QuickstartApplication.class, args);
	
	// Customer ram = (Customer)ctx.getBean("customer");  //casting is required 
	 
	                
	 Customer ram = ctx.getBean("customer",Customer.class);  // no need to cast 
	
	 System.out.println(ram);
	 
	 Customer shyam =ctx.getBean("shyam",Customer.class);
	 
	 System.out.println(shyam);
	
	 System.out.println(ctx.getBean(Invoice.class));
	 
	 
	   ctx.getBean(CustomerList.class).getCustList().forEach(System.out::println);
	   
	   System.out.println(ctx.getBean(Address.class));
	}

	// Factory method which will be invoked of IoC 
	@Bean
	public Customer shyam() {
		
		return new Customer(202, "Shyam Kumar", "shyam@abc.com");
	}

	@Bean
	public Customer manju() {
		
		return new Customer(303, "Manju Nath", "manju@abc.com");
	}

	@Bean
	public Customer vikas() {
		
		return new Customer(203, "Vikas Kanna", "vikas@abc.com");
	}
	@Bean
	public Invoice shyamInvoice() {
		
		return new Invoice(120, vikas(), LocalDate.of(2022,9,2), 56000);
	}
}
