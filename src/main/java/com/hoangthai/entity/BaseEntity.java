package com.hoangthai.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@CreatedBy
	private String createdBy;
	
	@Column
	@CreatedDate
	private Date createdDate;
	
	@Column
	@LastModifiedBy
	private String modifieldBy;
	
	@Column
	@LastModifiedDate
	private Date modifieldDate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifieldBy() {
		return modifieldBy;
	}

	public void setModifieldBy(String modifieldBy) {
		this.modifieldBy = modifieldBy;
	}

	public Date getModifieldDate() {
		return modifieldDate;
	}

	public void setModifieldDate(Date modifieldDate) {
		this.modifieldDate = modifieldDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
