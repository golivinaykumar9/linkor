package com.linkor.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class UserDetails {


	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userDetailsId;
	
	@NotEmpty
	@Column(name="STATUS", unique=true, nullable=false)
	private String status;
	
	@NotEmpty
	@Column(name="USERNAME", unique=true, nullable=false)
	private String userName;
	
	@NotEmpty
	@Column(name="EMAIL", unique=true, nullable=false)
	private String emailId;
	
	
	@OneToMany
	private List<Password> password;
	
	@OneToMany
	private List<UserPersonalInfo> userPersonalInfo;
	
	@OneToMany
	private List<Address> address;
	
	@OneToMany
	private List<Education> education;
	
	@OneToMany
	private List<Employment> employment;

	public Integer getUserDetailsId() {
		return userDetailsId;
	}

	public void setUserDetailsId(Integer userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<Password> getPassword() {
		return password;
	}

	public void setPassword(List<Password> password) {
		this.password = password;
	}

	public List<UserPersonalInfo> getUserPersonalInfo() {
		return userPersonalInfo;
	}

	public void setUserPersonalInfo(List<UserPersonalInfo> userPersonalInfo) {
		this.userPersonalInfo = userPersonalInfo;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Employment> getEmployment() {
		return employment;
	}

	public void setEmployment(List<Employment> employment) {
		this.employment = employment;
	}
	
	
	
	
	
	
	

}
