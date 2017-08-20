package com.cc.quick4j.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cc.quick4j.web.model.TbProduct;
import com.cc.quick4j.web.model.TbProductExample;

public interface TbProductMapper {
    int countByExample(TbProductExample example);

    int deleteByExample(TbProductExample example);

    int insert(TbProduct record);

    int insertSelective(TbProduct record);

    List<TbProduct> selectByExample(TbProductExample example);

    int updateByExampleSelective(@Param("record") TbProduct record, @Param("example") TbProductExample example);

    int updateByExample(@Param("record") TbProduct record, @Param("example") TbProductExample example);
}