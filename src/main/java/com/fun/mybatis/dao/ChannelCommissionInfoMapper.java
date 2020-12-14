package com.fun.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fun.mybatis.model.ChannelCommissionInfo;

@Repository
public interface ChannelCommissionInfoMapper {
    int deleteByPrimaryKey(Long channelId);

    int insert(ChannelCommissionInfo record);

    int insertSelective(ChannelCommissionInfo record);

    ChannelCommissionInfo selectByPrimaryKey(@Param("channelId")Long channelId);

    int updateByPrimaryKeySelective(ChannelCommissionInfo record);

    int updateByPrimaryKey(ChannelCommissionInfo record);
    
    List<ChannelCommissionInfo> queryPage(@Param("params") Map<String, Object> params);
}