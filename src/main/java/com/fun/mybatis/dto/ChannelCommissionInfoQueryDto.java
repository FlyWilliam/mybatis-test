package com.fun.mybatis.dto;

public class ChannelCommissionInfoQueryDto {
	
	private Long channelId;
	
	private String createdBy;

	public Long getChannelId() {
		return channelId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
