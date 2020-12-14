package com.fun.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.fun.mybatis.dto.ChannelCommissionInfoQueryDto;
import com.fun.mybatis.model.ChannelCommissionInfo;
import com.fun.mybatis.service.ChannelCommissionInfoService;
import com.fun.mybatis.support.DataPage;
import com.fun.mybatis.support.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class MybatisTestApplicationTests {

	@Autowired
	private ChannelCommissionInfoService channelCommissionInfoService;
	
	
	@Test
	public void testQueryById() {
		ChannelCommissionInfo channelInfo = channelCommissionInfoService.queryById(8000L);
		Assert.isNull(channelInfo, "不存在該對象");
	}
	
	
	@Test
	public void testQueryPage() {
		Page<ChannelCommissionInfo>  page = new Page<>(1, 100);
		page.setNeedTotalCount(false);
		page.setOrder("desc");
		page.setSort("created_date");
		ChannelCommissionInfoQueryDto dto = new ChannelCommissionInfoQueryDto();
		dto.setCreatedBy("qiang.li");
		DataPage<ChannelCommissionInfo> dataPage = channelCommissionInfoService.queryPage(page, dto);
		System.out.println(dataPage);
	}
	
	
}
