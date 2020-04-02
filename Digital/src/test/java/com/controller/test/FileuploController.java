package com.controller.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.digital.dto.FileUploadDto;
import com.digital.dto.ResponseDto;
import com.digital.entity.FileUpload;
import com.digital.service.FilesUploadService;
import com.digital.web.CustomerController;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FileuploController {

	@Mock
	FilesUploadService service;
	
	@InjectMocks
	CustomerController control;
	
	FileUpload upload=null;
	FileUploadDto uploadDto=null;
	ResponseDto response=null;
	
	
	@Test
	public void testFileUpload() {
		upload=new FileUpload();
		upload.setUserId(100L);
		upload.setDob("2010-02-03");
		upload.setEmailId("test@gmail.com");
		upload.setFirstName("test");
		upload.setLastName("test");
		upload.setGender("Male");
		
		
		uploadDto.setUserId(100L);
		uploadDto.setDob("2010-02-03");
		uploadDto.setEmailId("test@gmail.com");
		uploadDto.setFirstName("test");
		uploadDto.setLastName("test");
		uploadDto.setGender("Male");
		
		Mockito.when(service.fileUpload(uploadDto)).thenReturn(upload);
		ResponseEntity<ResponseDto> response=control.fileUpload(uploadDto);
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
	}
	
}
