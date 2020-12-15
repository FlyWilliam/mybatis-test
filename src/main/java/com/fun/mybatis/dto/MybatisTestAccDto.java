package com.fun.mybatis.dto;

import java.io.Serializable;

public class MybatisTestAccDto implements Serializable {

	private static final long serialVersionUID = 5186000716991188166L;

	private String account;
	
	private String name;

	public String getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
