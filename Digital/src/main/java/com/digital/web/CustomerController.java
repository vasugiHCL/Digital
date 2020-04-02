package com.digital.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.digital.dto.CustomerDto;
import com.digital.dto.ResponseDto;
import com.digital.entity.Customer;
import com.digital.exception.CustomerNotFoundException;
import com.digital.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	
	@PostMapping(value="customers/addcustomer")
	public ResponseEntity<ResponseDto> addCustomer(@RequestBody CustomerDto customerdto)throws CustomerNotFoundException{
		Customer customer=cs.addCustomer(customerdto);
		ResponseDto response=new ResponseDto();
		response.setMessage("Customer added successfully");
		response.setStatusCode(2003);
		return new ResponseEntity<ResponseDto>(response,HttpStatus.CREATED);
	}
	
	

}
