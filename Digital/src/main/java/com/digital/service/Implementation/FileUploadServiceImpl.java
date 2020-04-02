package com.digital.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digital.dto.FileUploadDto;
import com.digital.entity.FileUpload;
import com.digital.exception.UserIdNotFoundException;
import com.digital.repository.FileUploadRepo;
import com.digital.service.FilesUploadService;


@Service
public class FileUploadServiceImpl implements FilesUploadService{
	
	@Autowired
	FileUploadRepo repo;

	@Override
	public FileUpload fileUpload(FileUploadDto fileUploadDto) throws UserIdNotFoundException {
		FileUpload file=new FileUpload(fileUploadDto.getUserId(),fileUploadDto.getFirstName(),fileUploadDto.getLastName(),
				fileUploadDto.getGender(),fileUploadDto.getDob(),fileUploadDto.getEmailId());
		
		return repo.save(file);
	}

}
