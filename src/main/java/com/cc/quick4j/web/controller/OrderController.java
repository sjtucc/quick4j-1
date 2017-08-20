package com.cc.quick4j.web.controller;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.model.RequestPageInfo;
import com.cc.quick4j.web.model.TbOrder;
import com.cc.quick4j.web.model.TbUser;
import com.cc.quick4j.web.service.OrderService;
import com.cc.quick4j.web.service.TbUserService;


@Controller
@RequestMapping("/order")
public class OrderController {
	private static Logger logger = Logger.getLogger(OrderController.class);
	@Resource
	private OrderService orderService;
	@Resource
	private TbUserService userService;
	@Resource
	private HttpSession session;
	
	@ResponseBody
	@RequestMapping("/create")
	public TaotaoResult createOrder(@RequestBody TbOrder order) throws Exception {
		//先验证用户信息
		TbUser user = (TbUser)session.getAttribute("userSession");
		if(user==null || user.getPhone()==null || user.getPassword()==null 
				|| user.getPhone().trim().length()!=11 || user.getPassword().length()==0) {
			return TaotaoResult.build(800, "用户不存在，重新登录");
		}
		
		//校验参数
		if (!isOrderVaild(order)) {
			return TaotaoResult.build(300, "输入错误");
		}
		
		//存入数据库
		order.setId(UUID.randomUUID().toString()); //生成ID
		order.setAccount(user.getPhone());
		//查找公司名
		String company = userService.getCompanyByAccount(user.getPhone());
		if(company.equals("toomanyerror")) 
			return TaotaoResult.build(456, "一个账号多个公司名，拒绝生成订单！");
		if(company.trim().length()>0)
			company = new String(company.getBytes("ISO8859_1"),"GBK");
		order.setCompany(company);
		orderService.createOrder(order);
		
		logger.debug("创建订单成功");
		return TaotaoResult.ok();
		
	}
	
	@RequestMapping("/forordershow")
	@ResponseBody
	public TaotaoResult forordershow(@RequestBody RequestPageInfo requestPageInfo) throws Exception {
		TaotaoResult result = orderService.getItemList(requestPageInfo.getPage(), requestPageInfo.getRows());
		return result;
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public TaotaoResult editSave(@RequestBody TbOrder order) throws Exception {  //修改
		//校验参数
		if (!isOrderVaild(order)) {
			return TaotaoResult.build(601, "输入错误");
		}
		order.setId(order.getId().trim());
		order.setManufactures(order.getManufactures().trim());
		order.setModel(order.getModel().trim());
		order.setPerprice(order.getPerprice().trim());
		order.setNum(order.getNum().trim());
		order.setAllprice(order.getAllprice().trim());
		order.setCompany(order.getCompany().trim());
		TaotaoResult result = orderService.editSave(order);
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult delete(@RequestBody String id) throws Exception {  //删除
		if(id==null || id.length()==0) {
			return TaotaoResult.build(601, "查询参数出错");
		} else {
			TaotaoResult result = orderService.delete(id.trim());
			return result;
		}
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public TaotaoResult add(@RequestBody TbOrder order) throws Exception {  //增加
		//校验参数
		if (!isOrderVaild(order)) {
			return TaotaoResult.build(601, "输入错误");
		}
		//存入数据库
		order.setId(UUID.randomUUID().toString()); //生成ID
		orderService.createOrder(order);   //该方法和create使用相同的service，以后扩展要改！！！
		logger.debug("创建订单成功");
		return TaotaoResult.ok();
	}
	
	public boolean isOrderVaild(TbOrder order) {
		if (order==null || order.getManufactures()==null || order.getModel()==null
				 || order.getPerprice()==null || order.getNum()==null || order.getAllprice()==null
				 || order.getManufactures().length()==0 || order.getModel().length()==0
				 || order.getPerprice().length()==0 || order.getNum().length()==0 
				 || order.getAllprice().length()==0 || order.getCompany()==null) {
			return false;
		} else {
			return true;
		}
	}
}
