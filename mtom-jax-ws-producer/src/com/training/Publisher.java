package com.training;

import javax.xml.ws.Endpoint;

import com.training.services.ImageProcessingImpl;

public class Publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endpoint.publish("http://localhost:9000/images", new ImageProcessingImpl());
		
		System.out.println("Service Started");

	}

}

	