package com.linkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Password {


	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer passwordId;
	
	@NotEmpty
	@Column(name="STATUS", unique=true, nullable=false)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="userDetailsId", referencedColumnName="userDetailsId")
	private UserDetails userDetails;
	
	
	@NotEmpty
	@Column(name="PASSWORD", unique=true, nullable=false)
	private String Password;
	
	@Column(name="CREATED_DATE", nullable=true)
	private Date createdDate;
	
	@Column(name="UPDATED_DATE", nullable=true)
	private Date updatedDate;


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


	public Integer getPasswordId() {
		return passwordId;
	}


	public void setPasswordId(Integer passwordId) {
		this.passwordId = passwordId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public UserDetails getUserDetails() {
		return userDetails;
	}


	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
	

}
