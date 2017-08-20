package com.cc.quick4j.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cc.quick4j.core.util.IDUtils;
import com.cc.quick4j.core.util.MD5Utils;
import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.model.RequestPageInfo;
import com.cc.quick4j.web.model.TbUser;
import com.cc.quick4j.web.service.TbUserService;



@Controller
@RequestMapping("/user")
public class TbUserController {

	private static Logger logger = Logger.getLogger(TbUserController.class);
	@Resource
	private TbUserService userService;
	@Resource
	private HttpSession session;

	
	@ResponseBody
	@RequestMapping("/register")
	public TaotaoResult createUser(@RequestBody TbUser user) throws Exception {
		if (user==null || user.getPhone()==null || user.getPassword()==null || user.getPhone().trim().length()==0 
				|| user.getPassword().trim().length()==0) {
			return TaotaoResult.build(300, "输入错误");
		}
		// 先根据手机号从数据库中查看是否有匹配集
		List<TbUser> list = userService.getUserByPhone(user.getPhone());
		if (list!=null && list.size()>0) {
			// 返回前台，注册失败
			logger.debug("创建用户失败");
			return TaotaoResult.build(303, "用户已存在");
		} else {
			// 存入数据库
			user.setPassword(MD5Utils.MD5(user.getPassword())); // md5加密
			user.setId(IDUtils.genItemId()); //生成ID
			user.setAccess("0");
			userService.createUser(user);
			logger.debug("创建用户成功");
			return TaotaoResult.ok();
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public TaotaoResult login(@RequestBody TbUser user) throws Exception {
		if (user==null || user.getPhone()==null || user.getPassword()==null) {
			return TaotaoResult.build(300, "输入错误");
		}
		// 先根据手机号从数据库中查看是否有匹配集
		List<TbUser> list = userService.getUserByPhone(user.getPhone());
		if(list==null || list.size()==0) {
			logger.debug("用户名不存在");
			return TaotaoResult.build(301, "用户名不存在");
		}
		TbUser dbUser = list.get(0);
		if(MD5Utils.MD5(user.getPassword()).equals(dbUser.getPassword())) {
			logger.debug("用户登录成功");
			//判断用户是否有权限进入商品页面
			if(!dbUser.getAccess().equals("1")) {//无权限
				return TaotaoResult.build(999, "无权限进入商品页，待审核");
			}

			//用户信息存入session
			session.setAttribute("userSession", user);
			
			//更新登录时间
			userService.updateLoginTime(dbUser);
			return TaotaoResult.ok();
		} else {
			return TaotaoResult.build(302, "密码输入错误");
		}
		
	}
	
	@RequestMapping("/forusershow")
	@ResponseBody
	public TaotaoResult forshow(@RequestBody RequestPageInfo requestPageInfo) throws Exception {
		TaotaoResult result = userService.getItemList(requestPageInfo.getPage(), requestPageInfo.getRows());
		return result;
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public TaotaoResult editSave(@RequestBody TbUser user) throws Exception {  //修改
		if (user==null || user.getPhone()==null || user.getPassword()==null || user.getLogindate()==null
				|| user.getCreatedate()==null || user.getId()==null || !(user.getPhone().trim().matches("\\d{11}")) 
				|| user.getPassword().trim().length()==0 || user.getLogindate().length()==0 || user.getCreatedate().length()==0
				|| user.getAccess().trim().length()!=1) {
			return TaotaoResult.build(601, "输入错误");
		}
		user.setId(user.getId().trim());
		user.setPhone(user.getPhone().trim());
		user.setPassword(user.getPassword().trim());
		user.setCompany(user.getCompany().trim());
		user.setConsumer(user.getConsumer().trim());
		user.setAccess(user.getAccess().trim());
		user.setLogindate(user.getLogindate().trim());
		user.setCreatedate(user.getCreatedate().trim());

		TaotaoResult result = userService.editSave(user);
		return result;
		
		
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult delete(@RequestBody String id) throws Exception {  //删除
		if(id==null || id.length()==0) {
			return TaotaoResult.build(601, "查询参数出错");
		} else {
			TaotaoResult result = userService.delete(id.trim());
			return result;
		}
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public TaotaoResult add(@RequestBody TbUser user) throws Exception {  //增加
		if (user==null || user.getPhone()==null || user.getPassword()==null  
				|| !(user.getPhone().trim().matches("\\d{11}")) || !(user.getPassword().trim().matches("\\d{6}"))) {
			return TaotaoResult.build(601, "输入错误");
		}
		// 先根据手机号从数据库中查看是否有匹配集
		List<TbUser> list = userService.getUserByPhone(user.getPhone());
		if (list!=null && list.size()>0) {
			// 返回前台，注册失败
			logger.debug("创建用户失败");
			return TaotaoResult.build(802, "用户已存在");
		} else {
			user.setPassword(MD5Utils.MD5(user.getPassword())); // md5加密
			user.setId(IDUtils.genItemId()); //生成ID
			TaotaoResult result = userService.add(user);
			return result;
		}
	}

}

