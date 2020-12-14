package com.fun.mybatis.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fun.mybatis.dao.ChannelCommissionInfoMapper;
import com.fun.mybatis.dto.ChannelCommissionInfoQueryDto;
import com.fun.mybatis.model.ChannelCommissionInfo;
import com.fun.mybatis.support.DataPage;
import com.fun.mybatis.support.Page;
import com.fun.mybatis.utils.BeanUtil;
import com.fun.mybatis.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("channelCommissionInfoService")
public class ChannelCommissionInfoService {
	
	@Autowired
	private ChannelCommissionInfoMapper channelCommissionInfoMapper;
	
	public ChannelCommissionInfo queryById(Long channelId) {
		return channelCommissionInfoMapper.selectByPrimaryKey(channelId);
	}
	
	public DataPage<ChannelCommissionInfo> queryPage(Page<ChannelCommissionInfo> page,  ChannelCommissionInfoQueryDto dto) {
		Map<String, Object> params = BeanUtil.beanToMapByField(dto);
		params.put("orderBy", page.getSort());
		params.put("order", page.getOrder());
		
		page.setUsePageNo(true);
		PageInfo<ChannelCommissionInfo> pageInfo = PageHelper.startPage(page.getPageNo(), page.getPageSize()).count(page.isNeedTotalCount()).doSelectPageInfo(()->channelCommissionInfoMapper.queryPage(params));
		System.out.println(pageInfo);
		
		return PageUtil.toDataPage(pageInfo);
		
	}
	
	
}
