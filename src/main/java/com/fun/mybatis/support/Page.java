package com.fun.mybatis.support;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

public class Page<T> implements Serializable {
	
	//使用页号方式指定分页参数
	private boolean usePageNo = false;
	private int pageNo;
	private int pageSize;
	
	private int offset;
	private int limit;
	private String order;
	private String sort;
	
	private boolean needTotalCount = true;
	
	public Page(int pageNo, int pageSize) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.usePageNo = true;
	}
	
	
	public int getOffset() {
		return offset;
	}
	public int getLimit() {
		return limit;
	}
	public String getOrder() {
		return order;
	}
	public String getSort() {
		return sort;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public boolean isUsePageNo() {
		return usePageNo;
	}
	public int getPageNo() {
		return usePageNo ? pageNo : (offset/limit + 1);
	}
	public int getPageSize() {
		return usePageNo ? pageSize : limit;
	}
	public void setUsePageNo(boolean usePageNo) {
		this.usePageNo = usePageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public boolean isNeedTotalCount() {
		return needTotalCount;
	}


	public void setNeedTotalCount(boolean needTotalCount) {
		this.needTotalCount = needTotalCount;
	}


	public static Map<String, Object> returnEmptyPage() {
		Map<String, Object> map = new HashMap<>();
		map.put("total", 0);
		map.put("rows", new JSONArray());
		return map;
	}
	
	public static <T> Map<String, Object> returnPage(DataPage<T> dataPage) {
		if (dataPage == null) {
			return returnEmptyPage();
		}
		Map<String, Object> map = new HashMap<>();
		map.put("total", dataPage.getTotal());
		map.put("rows", dataPage.getDataList());
		return map;
 	}
	
}
