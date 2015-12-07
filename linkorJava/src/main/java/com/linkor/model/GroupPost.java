package com.linkor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class GroupPost {
	

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer groupPostId;
	
	@NotEmpty
	@Column(name="STATUS", unique=true, nullable=false)
	private String status;
	
	@NotEmpty
	@Column(name="GROUP_POST", unique=true, nullable=false)
	private String groupPost;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE", nullable=true)
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name="userDetailsId", referencedColumnName="userDetailsId")
	private UserDetails userDetails;
	
	@OneToMany(mappedBy="groupCommentId")
	private List<GroupComment> groupComment;

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

	public String getGroupPost() {
		return groupPost;
	}

	public void setGroupPost(String groupPost) {
		this.groupPost = groupPost;
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

	public List<GroupComment> getGroupComment() {
		return groupComment;
	}

	public void setGroupComment(List<GroupComment> groupComment) {
		this.groupComment = groupComment;
	}
	
	
	
	
	


}
