package com.cc.quick4j.web.controller;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cc.quick4j.web.model.TbOrder;
@Controller
@RequestMapping("/orderinfo")
public class OrderFileController {
	/**
	 * @author chenchen
	 * @title 读取excel，存数据库
	 */
	@RequestMapping("/dealExcel")
	public ModelAndView dealExcel(
		HttpServletRequest request,
        @RequestParam("uploadfile") CommonsMultipartFile file) throws Exception{
		
		InputStream fis = file.getInputStream();
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet1 = workbook.getSheetAt(0);/** 得到第一个sheet */
		int len = sheet1.getLastRowNum();
		ArrayList<TbOrder> orderList = new ArrayList<>(len+1);

		for(int i=1; i<=len; i++) {
			Row row = sheet1.getRow(i);
			if(row != null){
				TbOrder order = new TbOrder();
				if(row.getCell(0) != null) {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					order.setAccount((row.getCell(0).getStringCellValue()));
				} else {
					order.setAccount("");
				}
				if(row.getCell(1) != null) {
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
					order.setCompany((row.getCell(1).getStringCellValue()));
					order.setCompany(new String(order.getCompany().getBytes("GBK"),"ISO8859_1"));
				} else {
					order.setCompany("");
				}
				if(row.getCell(2) != null) {
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
					order.setManufactures((row.getCell(2).getStringCellValue()));
					order.setManufactures(new String(order.getManufactures().getBytes("GBK"),"ISO8859_1"));
				} else {
					order.setManufactures("");
				}
				if(row.getCell(3) != null) {
					row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
					order.setModel((row.getCell(3).getStringCellValue()));
			        order.setModel(new String(order.getModel().getBytes("GBK"),"ISO8859_1"));
				} else {
					order.setModel("");
				}
				if(row.getCell(4) != null) {
					row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
					order.setPerprice((row.getCell(4).getStringCellValue()));
				} else {
					order.setPerprice("");
				}
				if(row.getCell(5) != null) {
					row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
					order.setNum((row.getCell(5).getStringCellValue()));
				} else {
					order.setNum("");
				}
				if(row.getCell(6) != null) {
					row.getCell(6).setCellType(Cell.CELL_TYPE_STRING);
					order.setAllprice((row.getCell(6).getStringCellValue()));
				} else {
					order.setAllprice("");
				}
				if(row.getCell(7) != null) {
					row.getCell(7).setCellType(Cell.CELL_TYPE_STRING);
					String orderTm = row.getCell(7).getStringCellValue();
					order.setOrderdt(trans(orderTm));
				} else {
					order.setOrderdt("");
				}
				orderList.add(order);
			} else {
				continue;
			}
				
		}
		//deleteData(); 订单表不删除数据，追加数据
		
		goToSave(orderList);
		
		
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/pages/show/orderinfo.jsp"); 
		return mv;
	}
	


	
	private void goToSave(ArrayList<TbOrder> orderList) throws Exception {
        PreparedStatement pstmt = null;  
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
	       conn = DriverManager.getConnection("jdbc:mysql://120.26.136.231:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "wmt", "WMTwmt007");
        	// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "root", "111111");
	        conn.setAutoCommit(false); // 设置手动提交 
	        pstmt = conn.prepareStatement("insert into tb_order(id,account,company,manufactures,model,perprice,num,allprice,orderdt) VALUES (?,?,?,?,?,?,?,?,?)");
	        for(int i=0; i<orderList.size(); i++) {
	        	pstmt.setString(1, UUID.randomUUID().toString());
	        	pstmt.setString(2, orderList.get(i).getAccount());
	        	pstmt.setString(3, orderList.get(i).getCompany());
	        	pstmt.setString(4, orderList.get(i).getManufactures());
	        	pstmt.setString(5, orderList.get(i).getModel());
	        	pstmt.setString(6, orderList.get(i).getPerprice());
	        	pstmt.setString(7, orderList.get(i).getNum());
	        	pstmt.setString(8, orderList.get(i).getAllprice());
	        	pstmt.setString(9, orderList.get(i).getOrderdt());
	        	pstmt.addBatch();  // 加入批量处理  
	        }
	        pstmt.executeBatch(); // 执行批量处理
            conn.commit();  // 提交
        }
        catch (SQLException e) {  
            e.printStackTrace();  
        //恢复变量初始值     
        } finally { 
                if(pstmt != null) {  
                    pstmt.close();  
                    pstmt = null;  
                }  
                if(conn != null) {  
                    conn.close();  
                    conn = null;  
                }  

        }
        
	}
	
	public String trans(String orderTm) throws Exception { //日期补0
		if(orderTm==null || orderTm.length()<8 || orderTm.length()>10)
			throw new Exception("下单时间格式不对");
		String str = orderTm.trim();
		String[] arr = str.split("\\/");
		if(arr.length != 3)
			throw new Exception("下单时间格式不对");
		String year = arr[0];
		String yue = arr[1];
		String ri = arr[2];
		if(year.length()!=4 || yue.length()>2 || ri.length()>2) 
			throw new Exception("下单时间格式不对");
		if(yue.length()==1)
			yue = "0" + yue;
		if(ri.length()==1)
			ri = "0" + ri;
		return year + "/" + yue + "/" + ri;
	}
	

}
