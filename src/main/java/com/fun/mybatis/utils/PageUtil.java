package com.fun.mybatis.utils;

import com.fun.mybatis.support.DataPage;
import com.github.pagehelper.PageInfo;

public class PageUtil {

	
	public static <T> DataPage<T> toDataPage(PageInfo<T> pageInfo) {
		DataPage<T> dataPage = new DataPage<>();
		dataPage.setDataList(pageInfo.getList());
		dataPage.setFirstPage(pageInfo.isIsFirstPage());
		dataPage.setLastPage(pageInfo.isIsLastPage());
		dataPage.setPrePage(pageInfo.getPrePage());
		dataPage.setHasPreviousPage(pageInfo.isHasPreviousPage());
		dataPage.setNextPage(pageInfo.getNextPage());
		dataPage.setHasNextPage(pageInfo.isHasNextPage());
		dataPage.setPageNo(pageInfo.getPageNum());
		dataPage.setPageSize(pageInfo.getPageSize());
		dataPage.setTotal(pageInfo.getTotal());
		dataPage.setTotalPages(pageInfo.getPages());
		dataPage.setSize(pageInfo.getSize());
		return dataPage;
	}
}
