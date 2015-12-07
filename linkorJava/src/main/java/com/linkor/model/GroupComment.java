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
public class GroupComment {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer groupCommentId;
	
	@NotEmpty
	@Column(name="STATUS", unique=true, nullable=false)
	private String status;
	
	@NotEmpty
	@Column(name="GROUP_COMMENT", unique=true, nullable=false)
	private String groupComment;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE", nullable=true)
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name="userDetailsId", referencedColumnName="userDetailsId")
	private UserDetails userDetails;
	
	@ManyToOne
	@JoinColumn(name="groupPostId", nullable=false, updatable=false)
	private GroupPost groupPost;

	public Integer getAddressId() {
		return groupCommentId;
	}

	public void setAddressId(Integer addressId) {
		this.groupCommentId = addressId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGroupComment() {
		return groupComment;
	}

	public void setGroupComment(String groupComment) {
		this.groupComment = groupComment;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public GroupPost getGroupPost() {
		return groupPost;
	}

	public void setGroupPost(GroupPost groupPost) {
		this.groupPost = groupPost;
	}
	
	
	
}
