package com.fun.mybatis.support;

import java.io.Serializable;
import java.util.List;

public class DataPage<T> implements Serializable {
	
	//当前页
	private int pageNo;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;
    //总记录数
	private long total;
	//数据
	private List<T> dataList;
	//总页数
	private long totalPages;
	
	//前一页
    private int prePage;
    //下一页
    private int nextPage;

    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getSize() {
		return size;
	}

	public long getTotalPages() {
		return totalPages;
	}

	public int getPrePage() {
		return prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public boolean isFirstPage() {
		return isFirstPage;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	public long getTotal() {
		return total;
	}

	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

}
