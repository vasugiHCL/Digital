package com.controller.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.digital.dto.CustomerDto;
import com.digital.dto.ResponseDto;
import com.digital.entity.Customer;
import com.digital.exception.CustomerNotFoundException;
import com.digital.service.CustomerService;
import com.digital.web.CustomerController;

@RunWith(MockitoJUnitRunner.Silent.class)
public class CustomerControllerTest {
	
	@Mock
	CustomerService customerService;
	
	@InjectMocks
	CustomerController customerControl;
	
	Customer customer=null;
	CustomerDto customerDto=null;
	ResponseDto response=null;
	
	@Test
	public void testAddCustomer() throws CustomerNotFoundException{
		customer=new Customer();
		
		customer.setFirstName("Ram");
		customer.setLastName("raj");
		customer.setGender("Male");
		customer.setDob("1990-02-10");
		customer.setAadharNo("6760938462");
		
		customerDto=new CustomerDto();
		customerDto.setFirstName("Ram");
		customerDto.setLastName("raj");
		customerDto.setGender("Male");
		customerDto.setDob("1990-02-10");
		customerDto.setAadharNo("6760938462");
		
		Mockito.when(customerService.addCustomer(customerDto)).thenReturn(customer);
		ResponseEntity<ResponseDto> response=customerControl.addCustomer(customerDto);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
				
		
	}

}
