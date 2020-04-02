package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.digital.dto.CustomerDto;
import com.digital.entity.Customer;
import com.digital.repository.CustomerRepo;
import com.digital.service.Implementation.CustomerServiceImpl;

@RunWith(MockitoJUnitRunner.Silent.class)
public class CustomerServiceTest {
	
	@InjectMocks
	CustomerServiceImpl cusImpl;
	
	@Mock
	CustomerRepo repo;
	
	Customer customer=null;
	CustomerDto customerdto=null;
	
	@Test
	public void testAddCustomer() {
		
		customer=new Customer();
		
		customer.setFirstName("Ram");
		customer.setLastName("raj");
		customer.setGender("Male");
		customer.setDob("1990-02-10");
		
		
		customerdto=new CustomerDto();
		customerdto.setFirstName("Ram");
		customerdto.setLastName("raj");
		customerdto.setGender("Male");
		customerdto.setDob("1990-02-10");
		
		Mockito.when(cusImpl.addCustomer(customerdto)).thenReturn(customer);
		Mockito.when(repo.save(customer)).thenReturn(customer);
		Customer cus=cusImpl.addCustomer(customerdto);
		assertEquals(cus.getFirstName(), customer.getFirstName());
		
	}
	

}
