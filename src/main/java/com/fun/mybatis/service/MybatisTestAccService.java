package com.fun.mybatis.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fun.mybatis.dao.MybatisTestAccMapper;
import com.fun.mybatis.dto.ChannelCommissionInfoQueryDto;
import com.fun.mybatis.dto.MybatisTestAccDto;
import com.fun.mybatis.model.ChannelCommissionInfo;
import com.fun.mybatis.model.MybatisTestAcc;
import com.fun.mybatis.support.DataPage;
import com.fun.mybatis.support.Page;
import com.fun.mybatis.utils.BeanUtil;
import com.fun.mybatis.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("mybatisTestAccService")
public class MybatisTestAccService {
	
	@Autowired
	private MybatisTestAccMapper mybatisTestAccMapper;
	
	/**
	 * 分页方法
	 * @param page
	 * @param dto
	 * @return
	 */
	public DataPage<MybatisTestAcc> queryPage(Page<MybatisTestAcc> page,  MybatisTestAccDto dto) {
		Map<String, Object> params = BeanUtil.beanToMapByField(dto);
		params.put("orderBy", page.getSort());
		params.put("order", page.getOrder());
		
		//强制使用页号和页面大小设置
		page.setUsePageNo(true);
		PageInfo<MybatisTestAcc> pageInfo = PageHelper.startPage(page.getPageNo(), page.getPageSize()).count(page.isNeedTotalCount()).doSelectPageInfo(()->mybatisTestAccMapper.queryPage(params));
		
		return PageUtil.toDataPage(pageInfo);
		
	}
}
