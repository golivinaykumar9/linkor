package com.linkor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class UserPersonalInfo {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer conformationId;
	
	@NotEmpty
	@Column(name="CODE_SENT", unique=true, nullable=false)
	private String codeSent;
	

}
