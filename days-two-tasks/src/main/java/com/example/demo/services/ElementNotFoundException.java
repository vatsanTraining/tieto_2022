package com.example.demo.services;

import java.io.PrintWriter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Unchecked Exception => Can Handle or Declare , can leave it without handle or declare


@AllArgsConstructor
@Setter
@Getter
public class ElementNotFoundException extends RuntimeException {

	String errorCode;
	String message;
	
	@Override
	
	public void printStackTrace(PrintWriter s) {
		
		s.write(this.errorCode+","+this.message);
	}
	
	
	
	
	

}

////checked Exception You have either handle or declare , not doing it will be an exception
//public class ElementNotFoundException extends Exception {
//
//	public ElementNotFoundException(String string, String string2) {
//		// TODO Auto-generated constructor stub
//	}
//
//}
