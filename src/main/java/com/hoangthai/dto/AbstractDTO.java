package com.hoangthai.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbstractDTO<T> {

	private Long id;
	private String createdBy;
	private Date createdDate;
	private String modifieldBy;
	private Date modifieldDate;
	private List<T> listResult = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

}
