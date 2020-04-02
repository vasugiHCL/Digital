package com.digital.service;

import com.digital.dto.FileUploadDto;
import com.digital.entity.FileUpload;
import com.digital.exception.UserIdNotFoundException;

public interface FilesUploadService {
	
	FileUpload fileUpload(FileUploadDto fileUploadDto)throws UserIdNotFoundException;

}
