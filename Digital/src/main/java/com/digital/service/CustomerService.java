package com.digital.service;

import com.digital.dto.CustomerDto;
import com.digital.entity.Customer;
import com.digital.exception.CustomerNotFoundException;

public interface CustomerService {
	
	public Customer addCustomer(CustomerDto customerdto)throws CustomerNotFoundException;

}
