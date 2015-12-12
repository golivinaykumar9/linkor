package com.linkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USER_SIGNUP")
public class UserSignUp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer signUpId;

	@Column(name = "STATUS",nullable = false)
	private String status;

	@NotEmpty
	@Column(name = "USERNAME", unique = true, nullable = false)
	private String userName;
	
	@NotEmpty
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	@NotEmpty
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@NotEmpty
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@NotEmpty
	@Column(name = "EMAILID", unique = true, nullable = false)
	private String emailId;
	
	@NotEmpty
	@Column(name = "VERIFICATION_CODE", nullable = false)
	private String verificationCode;

	@NotEmpty
	@Column(name = "STATE_INDICATER", nullable = false)
	private String stateIndicater;
	
	@NotEmpty
	@Column(name = "CREATED_DATE", nullable = true)
	private Date createdDate;
	
	@NotEmpty
	@Column(name = "UPDATED_DATE", nullable = true)
	private Date updatedDate;

	
	
	public Integer getSignUpId() {
		return signUpId;
	}

	public void setSignUpId(Integer signUpId) {
		this.signUpId = signUpId;
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

	public Integer getId() {
		return signUpId;
	}

	public void setId(Integer id) {
		this.signUpId = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStateIndicater() {
		return stateIndicater;
	}

	public void setStateIndicater(String stateIndicater) {
		this.stateIndicater = stateIndicater;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
