package com.cc.quick4j.web.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cc.quick4j.core.util.EUDataGridResult;
import com.cc.quick4j.core.util.MysqlLuanMa;
import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.dao.TbOrderMapper;
import com.cc.quick4j.web.model.TbOrder;
import com.cc.quick4j.web.model.TbOrderExample;
import com.cc.quick4j.web.model.TbOrderExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class OrderServiceImpl implements OrderService {
	Logger logger = Logger.getLogger(ProductServiceImpl.class);
	@Resource 
	private TbOrderMapper tbOrderMapper;
	
	@Override
	public TaotaoResult createOrder(TbOrder order) throws Exception {
		MysqlLuanMa.solveProductLuanMa4(order); //解决数据库获取数据乱码问题
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		String orderdt = sd.format(new Date());
		order.setOrderdt(orderdt);
		tbOrderMapper.insert(order);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult getItemList(int page, int rows) throws Exception {
		logger.debug("查询商品列表");
		TbOrderExample example = new TbOrderExample();
		example.setOrderByClause("orderdt desc");
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbOrder> list = tbOrderMapper.selectByExample(example);
		if(list == null || list.size()==0)
			return TaotaoResult.build(600, "没查到数据");
		
		MysqlLuanMa.solveProductLuanMa3(list); //解决数据库获取数据乱码问题
				
		//创建返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbOrder> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return TaotaoResult.build(200, "ok", result);
	}

	@Override
	public TaotaoResult editSave(TbOrder order) throws Exception {
		MysqlLuanMa.solveProductLuanMa4(order); //解决数据库获取数据乱码问题
		
		TbOrderExample example = new TbOrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(order.getId());
		tbOrderMapper.updateByExample(order, example);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult delete(String id) throws Exception { //删除
		TbOrderExample example = new TbOrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		tbOrderMapper.deleteByExample(example);
		return TaotaoResult.ok();
	}

	
}
