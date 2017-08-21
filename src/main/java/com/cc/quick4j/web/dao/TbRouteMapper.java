package com.cc.quick4j.web.dao;

import com.cc.quick4j.web.model.TbRoute;
import com.cc.quick4j.web.model.TbRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRouteMapper {
    int countByExample(TbRouteExample example);

    int deleteByExample(TbRouteExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbRoute record);

    int insertSelective(TbRoute record);

    List<TbRoute> selectByExample(TbRouteExample example);

    TbRoute selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbRoute record, @Param("example") TbRouteExample example);

    int updateByExample(@Param("record") TbRoute record, @Param("example") TbRouteExample example);

    int updateByPrimaryKeySelective(TbRoute record);

    int updateByPrimaryKey(TbRoute record);
}