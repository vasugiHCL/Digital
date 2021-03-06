package com.digital.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.digital.dto.CustomerDto;
import com.digital.dto.FileUploadDto;
import com.digital.dto.ReferenceDto;
import com.digital.dto.ResponseDto;
import com.digital.entity.Customer;
import com.digital.entity.FileUpload;
import com.digital.exception.CustomerNotFoundException;
import com.digital.service.CustomerService;
import com.digital.service.FilesUploadService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@Autowired
	FilesUploadService fs;
	
	@PostMapping(value="customers/addcustomer")
	public ResponseEntity<ResponseDto> addCustomer(@RequestBody CustomerDto customerdto)throws CustomerNotFoundException{
		cs.addCustomer(customerdto);
		ResponseDto response=new ResponseDto();
		response.setMessage("Customer Appication added successfully");
		response.setStatusCode(2003);
		return new ResponseEntity<ResponseDto>(response,HttpStatus.CREATED);
	}
	
	@PostMapping(value="customers/fileUpload")
	public ResponseEntity<ResponseDto>fileUpload(@RequestBody FileUploadDto filedto)throws CustomerNotFoundException{
		FileUpload file=fs.fileUpload(filedto);
		ResponseDto response=new ResponseDto();
		response.setMessage("File Uploaded Successfully");
		response.setStatusCode(2003); 
		return new ResponseEntity<ResponseDto>(response,HttpStatus.CREATED);
	}
	
	//@GetMapping(value="customerId/verification/{customerId}")
	//public ResponseEntity<ResponseDto>verification(@RequestParam Long customerId,@RequestParam ReferenceDto refernce){
		
	
	
}
