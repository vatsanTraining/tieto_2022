package com.example.demo;

import com.example.demo.entity.Fee;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Application {

	public static void main(String[] args) {

		Client client = 
				ClientBuilder.newClient();
		
		 WebTarget target=     client.target("http://localhost:4040/api/v1/fees");
		 
		 Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		 
		 String choice ="get";
		 
		 if(choice.equals("get")) {
			 
		 Response  resp = builder.get();
		 
		  Fee[] list =resp.readEntity(Fee[].class);
		  
		  for(Fee eachItem:list) {
			  System.out.println(eachItem);
		  }
		 }
		 

		 if(choice.equals("post")) {
		 
			 Fee objToAdd = new Fee(20303, "B.E.Instru","II Year" ,67000.00D);
			 
			 Response postResp = builder.post(Entity.entity(objToAdd, MediaType.APPLICATION_JSON));
			 
			 System.out.println("Status Code:="+postResp.getStatus());
			 System.out.println("Record Added:="+postResp.readEntity(Fee.class));
			 
			 
		 
		 }

		 
	}

}
