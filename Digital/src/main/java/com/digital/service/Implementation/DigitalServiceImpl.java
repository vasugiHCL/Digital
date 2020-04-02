package com.digital.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.dto.ReferenceDto;
import com.digital.entity.Reference;
import com.digital.repository.CustomerRepo;
import com.digital.service.DigitalService;

@Service
public class DigitalServiceImpl implements DigitalService{
	
	@Autowired
	DigitalService digitalService;
	
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public Reference verifyCustomer(Long customerId,ReferenceDto reference) {
		
	}

}
