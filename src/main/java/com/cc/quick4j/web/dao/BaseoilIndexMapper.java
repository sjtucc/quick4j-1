package com.cc.quick4j.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cc.quick4j.web.model.BaseoilIndex;
import com.cc.quick4j.web.model.BaseoilIndexExample;

public interface BaseoilIndexMapper {
    int countByExample(BaseoilIndexExample example);

    int deleteByExample(BaseoilIndexExample example);

    int deleteByPrimaryKey(String indexId);

    int insert(BaseoilIndex record);

    int insertSelective(BaseoilIndex record);

    List<BaseoilIndex> selectByExample(BaseoilIndexExample example);

    BaseoilIndex selectByPrimaryKey(String indexId);

    int updateByExampleSelective(@Param("record") BaseoilIndex record, @Param("example") BaseoilIndexExample example);

    int updateByExample(@Param("record") BaseoilIndex record, @Param("example") BaseoilIndexExample example);

    int updateByPrimaryKeySelective(BaseoilIndex record);

    int updateByPrimaryKey(BaseoilIndex record);
}