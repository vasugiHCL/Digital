package com.digital.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.dto.CustomerDto;
import com.digital.entity.Customer;
import com.digital.exception.CustomerNotFoundException;
import com.digital.repository.CustomerRepo;
import com.digital.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public Customer addCustomer(CustomerDto customerdto) throws CustomerNotFoundException{
		Customer customer=new Customer(customerdto.getFirstName(),customerdto.getLastName(),customerdto.getDob(),customerdto.getGender());		
		return repo.save(customer);
		
	}

}
