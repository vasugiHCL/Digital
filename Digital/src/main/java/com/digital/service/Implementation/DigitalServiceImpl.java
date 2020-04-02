package com.digital.service.Implementation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.dto.ReferenceDto;
import com.digital.dto.ResponseDto;
import com.digital.entity.Customer;
import com.digital.entity.Reference;
import com.digital.exception.CustomerNotFoundException;
import com.digital.repository.CustomerRepo;
import com.digital.repository.ReferenceRepo;
import com.digital.service.DigitalService;

@Service
public class DigitalServiceImpl implements DigitalService{
	
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ReferenceRepo repo;

	@Override
	public ResponseDto verifyCustomer(Long customerId,ReferenceDto reference) {
		Optional<Customer> customer=customerRepo.findById(customerId);
		
		if(!customer.isPresent()){
			throw new CustomerNotFoundException();
		}
		Reference ref=repo.findByCustomerId(customerId);
		
		
		if((customer.get().getCustomerId()).equals(ref)) {
			
			if((customer.get().getFirstName()).equals(ref.getFirstName())
					&&((customer.get().getLastName()).equals(ref.getLastName())
							&&((customer.get().getDob()).equals(ref.getDob()) 
									&& ((customer.get().getGender()).equals(ref.getGender())))));
			
			ResponseDto response=new ResponseDto();
			 response.setMessage("EV verfication done successfully");
			response.setStatusCode(200);
		
		 return response;
			
		}
		else {
			
			ResponseDto response=new ResponseDto();
			response.setMessage("the details are wrong,go to url customer/upload");
			response.setStatusCode(4003);
			
			
			return response;
		}
		
	}

}
