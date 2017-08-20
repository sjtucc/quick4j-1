package com.cc.quick4j.web.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cc.quick4j.core.util.EUDataGridResult;
import com.cc.quick4j.core.util.MysqlLuanMa;
import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.dao.TbUserMapper;
import com.cc.quick4j.web.model.TbUser;
import com.cc.quick4j.web.model.TbUserExample;
import com.cc.quick4j.web.model.TbUserExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TbUserServiceImpl implements TbUserService {
	@Resource 
	private TbUserMapper tbUserMapper;

	@Override
	public TaotaoResult createUser(TbUser user) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String createdate = sd.format(new Date());
		user.setCreatedate(createdate);
		user.setLogindate(createdate);
		tbUserMapper.insert(user);
		return TaotaoResult.ok();
	}

	@Override
	public List<TbUser> getUserByPhone(String phone) {
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone);
		List<TbUser> result = tbUserMapper.selectByExample(example);
		if(result != null && result.size() > 0) {
			return result;
		} else {
			return null;
		}
		
	}
	
	/**
	 * 获取用户列表
	 * @throws Exception 
	 */
	@Override
	public TaotaoResult getItemList(int page, int rows) throws Exception {
		TbUserExample example = new TbUserExample();
		example.setOrderByClause("createdate desc");
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbUser> list = tbUserMapper.selectByExample(example);
		if(list == null || list.size()==0)
			return TaotaoResult.build(600, "没查到数据");
		MysqlLuanMa.solveProductLuanMa6(list); //解决数据库获取数据乱码问题	
		//创建返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbUser> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return TaotaoResult.build(200, "ok", result);
		
	}

	@Override
	public TaotaoResult editSave(TbUser user) throws Exception {  //修改保存
		MysqlLuanMa.solveProductLuanMa5(user); //解决数据库存储数据乱码问题
		
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(user.getId());
		tbUserMapper.updateByExample(user, example);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult delete(String id) throws Exception { //删除
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		tbUserMapper.deleteByExample(example);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult add(TbUser user) throws Exception { //增加
		//首先查出所有账号，不能创建相同的
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(user.getId());
		List<TbUser> list = tbUserMapper.selectByExample(example);
		if(list!=null && list.size()>0) {
			return TaotaoResult.build(802, "账号已经存在！");
		}
	
		//无重复，添加这条记录到数据库
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String createdate = sd.format(new Date());
		user.setCreatedate(createdate);
		user.setLogindate(createdate);
		MysqlLuanMa.solveProductLuanMa5(user); //解决数据库存储数据乱码问题
		tbUserMapper.insert(user);
		return TaotaoResult.ok();
	}

	@Override
	public void updateLoginTime(TbUser user) throws Exception {  //更新登录时间
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String date = sd.format(new Date());
		user.setLogindate(date);
		
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(user.getPhone());
		tbUserMapper.updateByExample(user, example);
	}

	@Override
	public String getCompanyByAccount(String account) { //根据账号查找公司名
		if(account == null || account.trim().length() == 0) {
			return "";
		}
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(account.trim());
		List<TbUser> list = tbUserMapper.selectByExample(example);
		if(list == null || list.size() == 0) {
			return "";
		} else if(list.size() > 1) {
			return "toomanyerror";
		} else {
			String company = list.get(0).getCompany();
			if(company!=null)
				return company.trim();
			else
				return "";
					
		}

	}
	
	
	
}
