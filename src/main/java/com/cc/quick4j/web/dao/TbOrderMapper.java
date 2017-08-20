package com.cc.quick4j.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cc.quick4j.web.model.TbOrder;
import com.cc.quick4j.web.model.TbOrderExample;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);
}