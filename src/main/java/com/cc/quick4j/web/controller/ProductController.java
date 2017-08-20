package com.cc.quick4j.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.model.RequestPageInfo;
import com.cc.quick4j.web.model.TbProduct;
import com.cc.quick4j.web.model.TbUser;
import com.cc.quick4j.web.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Resource
	private ProductService productService;
	@Resource 
	private HttpSession session;
	
	@RequestMapping("/list")
	@ResponseBody
	public TaotaoResult getItemList(@RequestBody RequestPageInfo requestPageInfo) throws Exception {
		//先验证用户信息
		TbUser user = (TbUser)session.getAttribute("userSession");
		if(user==null || user.getPhone()==null || user.getPassword()==null 
				|| user.getPhone().trim().length()!=11 || user.getPassword().length()==0) {
			return TaotaoResult.build(800, "用户不存在，重新登录");
		}

		if(requestPageInfo!=null && requestPageInfo.getPage()!=null 
				&& requestPageInfo.getRows()!=null) {
			TaotaoResult result = productService.getItemList(requestPageInfo.getPage(), requestPageInfo.getRows());
			return result;
		} else {
			return TaotaoResult.build(601, "查询参数出错");
		}
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public TaotaoResult getSearchList(@RequestBody String searchText) throws Exception {
		if(searchText!=null && searchText.length()!=0) {
			TaotaoResult result = productService.getSearchList(searchText);
			return result;
		} else {
			return TaotaoResult.build(601, "查询参数出错");
		}
	}
	
	@RequestMapping("/forproductshow")
	@ResponseBody
	public TaotaoResult forshow(@RequestBody RequestPageInfo requestPageInfo) throws Exception {
		TaotaoResult result = productService.getItemList(requestPageInfo.getPage(), requestPageInfo.getRows());
		return result;
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public TaotaoResult editSave(@RequestBody TbProduct product) throws Exception {  //修改
		if(product==null || product.getId()==null || product.getManufactures()==null 
				|| product.getModel()==null || product.getPrice()==null || product.getAddress()==null) {
			return TaotaoResult.build(601, "提交参数出错！");
		}
		product.setId(product.getId().trim());
		product.setManufactures(product.getManufactures().trim());
		product.setModel(product.getModel().trim());
		product.setAddress(product.getAddress().trim());
		product.setGodate(product.getGodate().trim());
		product.setDowndate(product.getDowndate().trim());
		TaotaoResult result = productService.editSave(product);
		return result;
	}
	

	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult delete(@RequestBody String id) throws Exception {  //删除
		if(id==null || id.length()==0) {
			return TaotaoResult.build(601, "查询参数出错");
		} else {
			TaotaoResult result = productService.delete(id.trim());
			return result;
		}
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public TaotaoResult add(@RequestBody TbProduct product) throws Exception {  //增加
		if(product==null || product.getManufactures()==null 
				|| product.getModel()==null || product.getPrice()==null || product.getAddress()==null) {
			return TaotaoResult.build(601, "提交参数出错！");
		}
		product.setManufactures(product.getManufactures().trim());
		product.setModel(product.getModel().trim());
		product.setAddress(product.getAddress().trim());
		product.setGodate(product.getGodate().trim());
		product.setDowndate(product.getDowndate().trim());
		TaotaoResult result = productService.add(product);
		return result;
	}
	
}
