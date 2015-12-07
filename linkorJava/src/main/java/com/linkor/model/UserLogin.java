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
@Table(name="USER_LOGIN")
public class UserLogin {
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer loginId;
	
	@NotEmpty
	@Column(name="STATUS",  nullable=false)
	private String status;
	
	@NotEmpty
	@Column(name="USERNAME",  nullable=false)
	private String userName;
	
	@NotEmpty
	@Column(name="PASSWORD",  nullable=false)
	private String password;
	
	@NotEmpty
	@Column(name="ROLE",  nullable=false)
	private String role;
	
	@NotEmpty
	@Column(name="STATE_INDICATER",  nullable=false)
	private String stateIndicater;
	
	@NotEmpty
	@Column(name="CREATED_DATE",  nullable=false)
	private Date createdDate;
	
	
	@NotEmpty
	@Column(name="UPDATED_DATE",  nullable=false)
	private Date updatedDate;


	public Integer getLoginId() {
		return loginId;
	}


	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
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
