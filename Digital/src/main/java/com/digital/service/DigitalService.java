package com.digital.service;

import com.digital.dto.ReferenceDto;
import com.digital.dto.ResponseDto;


public interface DigitalService {
	
	ResponseDto verifyCustomer(Long customerId,ReferenceDto reference);
	
	

}
