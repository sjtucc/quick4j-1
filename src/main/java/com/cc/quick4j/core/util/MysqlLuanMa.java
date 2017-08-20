package com.cc.quick4j.core.util;

import java.util.List;

import com.cc.quick4j.web.model.TbOrder;
import com.cc.quick4j.web.model.TbProduct;
import com.cc.quick4j.web.model.TbUser;

public class MysqlLuanMa {
	public static final void solveProductLuanMa(List<TbProduct> list) throws Exception { //从数据库取出后改码
		for(int i=0; i<list.size(); i++) {
			String manufactures = list.get(i).getManufactures();
			if(manufactures!=null)
				list.get(i).setManufactures(new String(manufactures.getBytes("ISO8859_1"),"GBK"));
			String model = list.get(i).getModel();
			if(model!=null)
				list.get(i).setModel(new String(model.getBytes("ISO8859_1"),"GBK"));
			String address = list.get(i).getAddress();
			if(address!=null)
				list.get(i).setAddress(new String(address.getBytes("ISO8859_1"),"GBK"));
		}
		
	}

	public static final void solveProductLuanMa2(TbProduct product) throws Exception {  //存入数据库前改码
		product.setManufactures(new String(product.getManufactures().getBytes("GBK"),"ISO8859_1"));
		product.setModel(new String(product.getModel().getBytes("GBK"),"ISO8859_1"));
		product.setAddress(new String(product.getAddress().getBytes("GBK"),"ISO8859_1"));
	}
	
	public static final void solveProductLuanMa3(List<TbOrder> list) throws Exception { //从数据库取出后改码
		for(int i=0; i<list.size(); i++) {
			String manufactures = list.get(i).getManufactures();
			if(manufactures!=null)
				list.get(i).setManufactures(new String(manufactures.getBytes("ISO8859_1"),"GBK"));
			String model = list.get(i).getModel();
			if(model!=null)
				list.get(i).setModel(new String(model.getBytes("ISO8859_1"),"GBK"));
			String company = list.get(i).getCompany();
			if(company!=null)
				list.get(i).setCompany(new String(company.getBytes("ISO8859_1"),"GBK"));
		}
		
	}
	
	public static final void solveProductLuanMa4(TbOrder order) throws Exception {  //存入数据库前改码
		order.setManufactures(new String(order.getManufactures().getBytes("GBK"),"ISO8859_1"));
		order.setModel(new String(order.getModel().getBytes("GBK"),"ISO8859_1")); 
		order.setCompany(new String(order.getCompany().getBytes("GBK"),"ISO8859_1")); 
	}
	
	public static final void solveProductLuanMa5(TbUser user) throws Exception {  //存入数据库前改码
		if(user.getCompany()!=null)
			user.setCompany(new String(user.getCompany().getBytes("GBK"),"ISO8859_1"));
		if(user.getConsumer()!=null)
			user.setConsumer(new String(user.getConsumer().getBytes("GBK"),"ISO8859_1"));
	}
	
	public static final void solveProductLuanMa6(List<TbUser> list) throws Exception { //从数据库取出后改码
		for(int i=0; i<list.size(); i++) {
			String company = list.get(i).getCompany();
			if(company!=null)
				list.get(i).setCompany(new String(company.getBytes("ISO8859_1"),"GBK"));
			String consumer = list.get(i).getConsumer();
			if(consumer!=null)
				list.get(i).setConsumer(new String(consumer.getBytes("ISO8859_1"),"GBK"));
		}
		
	}
}
