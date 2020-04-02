package com.digital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileUpload {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fieldId;
	private Long userId;
	private String aadharNo;
	private String dob;
	private String emailId;
	private String firstName;
	private String gender;
	private String lastName;
	public FileUpload(Long userId, String aadharNo, String dob, String emailId, String firstName, String gender,
			String lastName) {
		super();
		this.userId = userId;
		this.aadharNo = aadharNo;
		this.dob = dob;
		this.emailId = emailId;
		this.firstName = firstName;
		this.gender = gender;
		this.lastName = lastName;
	}
	public FileUpload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getFieldId() {
		return fieldId;
	}
	public void setFieldId(Long fieldId) {
		this.fieldId = fieldId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	

}
