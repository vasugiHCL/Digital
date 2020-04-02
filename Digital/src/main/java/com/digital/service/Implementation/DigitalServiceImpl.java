package com.digital.service.Implementation;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.dto.ReferenceDto;
import com.digital.entity.Customer;
import com.digital.entity.Reference;
import com.digital.exception.CustomerNotFoundException;
import com.digital.repository.CustomerRepo;
import com.digital.repository.FileUploadRepo;
import com.digital.repository.ReferenceRepo;
import com.digital.service.DigitalService;

@Service
public class DigitalServiceImpl implements DigitalService{
	
	@Autowired
	DigitalService digitalService;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ReferenceRepo repo;

	@Override
	public Reference verifyCustomer(Long customerId,ReferenceDto reference) {
		Optional<Customer> customer=customerRepo.findById(customerId);
		
		if(!customer.isPresent()){
			throw new CustomerNotFoundException();
		}
		Reference ref=repo.findByCustomerId(customerId);
		
		
	}

}
