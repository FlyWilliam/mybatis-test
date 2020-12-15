package com.fun.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.fun.mybatis.model.MybatisTestAcc;

@Repository
public interface MybatisTestAccMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MybatisTestAcc record);

    int insertSelective(MybatisTestAcc record);

    MybatisTestAcc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MybatisTestAcc record);

    int updateByPrimaryKey(MybatisTestAcc record);
    
    /**
     * 分页查询方法 依赖pageHelper辅助
     * @param params
     * @return
     */
    List<MybatisTestAcc> queryPage(@Param("params") Map<String, Object> params);
}