package com.cc.quick4j.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cc.quick4j.core.util.EUDataGridResult;
import com.cc.quick4j.core.util.MysqlLuanMa;
import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.dao.TbProductMapper;
import com.cc.quick4j.web.model.TbProduct;
import com.cc.quick4j.web.model.TbProductExample;
import com.cc.quick4j.web.model.TbProductExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
public class ProductServiceImpl implements ProductService {
	Logger logger = Logger.getLogger(ProductServiceImpl.class);
	
	@Resource
	private  TbProductMapper tbProductMapper;
	
	/**
	 * 获取商品列表
	 * @throws Exception 
	 */
	@Override
	public TaotaoResult getItemList(int page, int rows) throws Exception {
		logger.debug("查询商品列表");
		TbProductExample example = new TbProductExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbProduct> list = tbProductMapper.selectByExample(example);
		if(list == null || list.size()==0)
			return TaotaoResult.build(600, "没查到数据");
		
		MysqlLuanMa.solveProductLuanMa(list); //解决数据库获取数据乱码问题
				
		//创建返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbProduct> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return TaotaoResult.build(200, "ok", result);
		
	}
	
	/**
	 * 获取搜索商品列表
	 * @throws Exception 
	 */
	@Override
	public TaotaoResult getSearchList(String searchText) throws Exception {
		logger.debug("查询搜索商品列表,不分页");
		TbProductExample example = new TbProductExample();
		List<TbProduct> list = tbProductMapper.selectByExample(example);
		if(list == null || list.size()==0)
			return TaotaoResult.build(600, "没查到数据");
		
		MysqlLuanMa.solveProductLuanMa(list); //解决数据库获取数据乱码问题
		
		List<TbProduct> matchList = new ArrayList<TbProduct>();
		for(int i=0; i<list.size(); i++) {  //匹配厂商和型号
			TbProduct item = list.get(i);
			if(item.getManufactures().indexOf(searchText)>=0 || item.getManufactures().indexOf(searchText.toLowerCase())>=0
					|| item.getManufactures().indexOf(searchText.toUpperCase())>=0) {
				matchList.add(item);
			}
			if(item.getModel().indexOf(searchText)>=0 || item.getModel().indexOf(searchText.toLowerCase())>=0
					|| item.getModel().indexOf(searchText.toUpperCase())>=0) {
				matchList.add(item);
			}
		}
		if(matchList == null || matchList.size()==0)
			return TaotaoResult.build(600, "没查到数据");
		//创建返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(matchList);
		result.setTotal(matchList.size());
		return TaotaoResult.build(200, "ok", result);
	}

	
	
	
	@Override
	public TaotaoResult editSave(TbProduct product) throws Exception {  //修改保存
		
		MysqlLuanMa.solveProductLuanMa2(product); //解决数据库获取数据乱码问题
		
		TbProductExample example = new TbProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(product.getId());
		tbProductMapper.updateByExample(product, example);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult delete(String id) throws Exception { //删除
		TbProductExample example = new TbProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		tbProductMapper.deleteByExample(example);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult add(TbProduct product) throws Exception {
		//首先查出所有厂家和型号，不能创建相同的
		TbProductExample example = new TbProductExample();
		List<TbProduct> list = tbProductMapper.selectByExample(example);
		if(list != null && list.size()!=0) {
			MysqlLuanMa.solveProductLuanMa(list); //解决数据库获取数据乱码问题
			for(int i=0; i<list.size(); i++) {
				TbProduct item = list.get(i);
				if(item.getManufactures().equals(product.getManufactures()) && 
						item.getModel().equals(product.getModel())) {
					return TaotaoResult.build(802, "厂家型号已经存在！");
				}
			}
		}
		
		//无重复厂家型号，添加这条记录到数据库
		MysqlLuanMa.solveProductLuanMa2(product);
		product.setId(UUID.randomUUID().toString());
		tbProductMapper.insert(product);
		return TaotaoResult.ok();
	}


	
	
}
