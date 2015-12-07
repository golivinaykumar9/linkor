package com.linkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Employment {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employmentId;
	
	@NotEmpty
	@Column(name="STATUS", unique=true, nullable=false)
	private String status;
	
	@NotEmpty
	@Column(name="COMPANY_NAME", unique=true, nullable=false)
	private String companyName;
	
	@NotEmpty
	@Column(name="PROFESSION", unique=true, nullable=false)
	private String profession;
	
	@NotEmpty
	@Column(name="CITY", unique=true, nullable=false)
	private String city;
	
	@NotEmpty
	@Column(name="STATE", unique=true, nullable=false)
	private String state;
	
	@NotEmpty
	@Column(name="COUNTRY", unique=true, nullable=false)
	private String country;
	
	@ManyToOne
	@JoinColumn(name="userDetailsId", referencedColumnName="userDetailsId")
	private UserDetails userDetails;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE", nullable=true)
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE", nullable=true)
	private Date updatedDate;

	public Integer getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(Integer employmentId) {
		this.employmentId = employmentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
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
