package com.linkor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Groups {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer groupPostId;
	
	@NotEmpty
	@Column(name="STATUS", unique=true, nullable=false)
	private String status;
	
	@NotEmpty
	@Column(name="GROUP_NAME", unique=true, nullable=false)
	private String groupName;
	
	@NotEmpty
	@Column(name="GROUP_DESC", unique=true, nullable=false)
	private String groupDesc;
	
	@NotEmpty
	@Column(name="VISIBILITY", unique=true, nullable=false)
	private String visibility;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE", nullable=true)
	private Date createdDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "GROUP_USER", joinColumns = { @JoinColumn(name = "groupPostId") }, inverseJoinColumns = { @JoinColumn(name = "userDetailsId") })
	private List<UserDetails> groupUsers;
	
	
	public Integer getGroupPostId() {
		return groupPostId;
	}

	public void setGroupPostId(Integer groupPostId) {
		this.groupPostId = groupPostId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<UserDetails> getGroupUsers() {
		return groupUsers;
	}

	public void setGroupUsers(List<UserDetails> groupUsers) {
		this.groupUsers = groupUsers;
	}

	
	
	

}
