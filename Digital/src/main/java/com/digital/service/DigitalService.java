package com.digital.service;

import com.digital.dto.ReferenceDto;
import com.digital.dto.ResponseDto;
import com.digital.exception.DetailsNotMatchException;


public interface DigitalService {
	
	ResponseDto verifyCustomer(Long customerId,ReferenceDto reference)throws DetailsNotMatchException;
	
	

}
