package org.demo.module1;


import org.springframework.stereotype.Component;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Component

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

	String addressLine1;
	String addressLine2;
	long pinCode;
	
}
