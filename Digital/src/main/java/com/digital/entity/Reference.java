package com.digital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author User1
 *
 */
@Entity
@Table(name="reference")
public class Reference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uniqueId;
	private Long customerId;
	private String aadharNo;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	
	public Reference(Long customerId, String aadharNo, String firstName, String lastName, String dob, String gender) {
		super();
		this.customerId = customerId;
		this.aadharNo = aadharNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}

	public Reference() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	
	

}
