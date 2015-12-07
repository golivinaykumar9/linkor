package com.linkor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="USER_CONFORMATION")
public class UserConformation {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer conformationId;
	
	@NotEmpty
	@Column(name="CODE_SENT", unique=true, nullable=false)
	private String codeSent;
	
	@NotEmpty
	@Column(name="CREATED_DATE", unique=true, nullable=false)
	private Date createdDate;
	
	@OneToOne
	private UserSignUp userSignUp;

	public Integer getConformationId() {
		return conformationId;
	}

	public void setConformationId(Integer conformationId) {
		this.conformationId = conformationId;
	}

	public String getCodeSent() {
		return codeSent;
	}

	public void setCodeSent(String codeSent) {
		this.codeSent = codeSent;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public UserSignUp getUserSignUp() {
		return userSignUp;
	}

	public void setUserSignUp(UserSignUp userSignUp) {
		this.userSignUp = userSignUp;
	}
	
	
}
