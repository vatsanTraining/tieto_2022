package com.example.demo.mapper;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ElementNotFoundException {

	private String message ;
	private String errorCode;
	
	
	
	public ElementNotFoundException(String message,String errorCode) {
		super();
		this.message = message;
		this.errorCode=errorCode;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getErrorCode() {
		return errorCode;
	}



	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	




	
}
