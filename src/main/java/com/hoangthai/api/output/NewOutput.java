package com.hoangthai.api.output;

import java.util.ArrayList;
import java.util.List;

import com.hoangthai.dto.NewDTO;

public class NewOutput {

	private int page;
	private int toptalPage;
	private List<NewDTO> listResult = new ArrayList<>();
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getToptalPage() {
		return toptalPage;
	}
	public void setToptalPage(int toptalPage) {
		this.toptalPage = toptalPage;
	}
	public List<NewDTO> getListResult() {
		return listResult;
	}
	public void setListResult(List<NewDTO> listResult) {
		this.listResult = listResult;
	}
	
	
}
