package com.digital.service;

import com.digital.dto.ReferenceDto;
import com.digital.entity.Reference;

public interface DigitalService {
	
	Reference verifyCustomer(Long customerId,ReferenceDto reference);
	
	

}
