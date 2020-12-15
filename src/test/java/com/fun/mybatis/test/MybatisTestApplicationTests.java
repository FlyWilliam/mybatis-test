package com.fun.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fun.mybatis.dto.MybatisTestAccDto;
import com.fun.mybatis.model.MybatisTestAcc;
import com.fun.mybatis.service.MybatisTestAccService;
import com.fun.mybatis.support.DataPage;
import com.fun.mybatis.support.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class MybatisTestApplicationTests {

	@Autowired
	private MybatisTestAccService mybatisTestAccService;
	
	
	@Test
	public void testQueryPage() {
		Page<MybatisTestAcc>  page = new Page<>(1, 100);
		page.setNeedTotalCount(true); //是否count查询
		page.setOrder("desc");
		page.setSort("created_date");
		MybatisTestAccDto dto = new MybatisTestAccDto();
		//dto.setAccount("funName1");
		DataPage<MybatisTestAcc> dataPage = mybatisTestAccService.queryPage(page, dto);
		System.out.println(dataPage);
	}
	
	
}
