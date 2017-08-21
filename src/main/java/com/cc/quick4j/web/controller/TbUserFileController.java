package com.cc.quick4j.web.controller;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cc.quick4j.core.util.IDUtils;
import com.cc.quick4j.core.util.MD5Utils;
import com.cc.quick4j.web.model.TbUser;
@Controller
@RequestMapping("/userinfo")
public class TbUserFileController {
	/**
	 * @author chenchen
	 * @title 读取excel，存数据库
	 */
	@RequestMapping("/dealExcel")
	public ModelAndView dealExcel(
		//HttpServletRequest request,
        //@RequestParam("uploadfile") CommonsMultipartFile file) throws Exception{
			
		@RequestParam(value = "files") MultipartFile [] files, HttpServletRequest request, HttpServletResponse response) throws Exception{
		MultipartFile file = files[0];
	
		
		InputStream fis = file.getInputStream();
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet1 = workbook.getSheetAt(0);/** 得到第一个sheet */
		int len = sheet1.getLastRowNum();
		ArrayList<TbUser> userList = new ArrayList<>(len+1);

		for(int i=1; i<=len; i++) {
			Row row = sheet1.getRow(i);
			if(row != null){
				TbUser user = new TbUser();
				if(row.getCell(0) != null) {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					user.setPhone((row.getCell(0).getStringCellValue()));
				} else {
					user.setPhone("");
				}
				if(row.getCell(1) != null) {
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
					user.setPassword((row.getCell(1).getStringCellValue()));
				} else {
					user.setCompany("");
				}
				if(row.getCell(2) != null) {
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
					user.setCompany((row.getCell(2).getStringCellValue()));
					user.setCompany(new String(user.getCompany().getBytes("GBK"),"ISO8859_1"));
				} else {
					user.setCompany("");
				}
				if(row.getCell(3) != null) {
					row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
					user.setConsumer((row.getCell(3).getStringCellValue()));
			        user.setConsumer(new String(user.getConsumer().getBytes("GBK"),"ISO8859_1"));
				} else {
					user.setConsumer("");
				}
				if(row.getCell(4) != null) {
					row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
					user.setAccess((row.getCell(4).getStringCellValue()));
				} else {
					user.setAccess("");
				}
				if(row.getCell(5) != null) {
					row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
					user.setCreatedate((row.getCell(5).getStringCellValue()));
				} else {
					user.setCreatedate("");
				}
				if(row.getCell(6) != null) {
					row.getCell(6).setCellType(Cell.CELL_TYPE_STRING);
					user.setLogindate((row.getCell(6).getStringCellValue()));
				} else {
					user.setLogindate("");
				}
				userList.add(user);
			} else {
				continue;
			}
				
		}
		//deleteData(); 订单表不删除数据，追加数据
		
		goToSave(userList);
		
		
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/store/userinfo.jsp"); 
		return mv;
	}
	

	private void goToSave(ArrayList<TbUser> userList) throws Exception {
        PreparedStatement pstmt = null;  
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
	       conn = DriverManager.getConnection("jdbc:mysql://120.26.136.231:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "wmt", "WMTwmt007");
        	// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "root", "111111");
	       // conn.setAutoCommit(false); // 设置手动提交 
	        ResultSet rs = null;
	        for(int i=0; i<userList.size(); i++) {
	        	boolean flag = false;
	        	pstmt=conn.prepareStatement("select phone from tb_user where phone=?");
	        	pstmt.setString(1, userList.get(i).getPhone());
	        	rs = pstmt.executeQuery();
	        	if(rs.next()) {
	        		flag = true;
	        	}
	        	if(flag)
	        		continue;
	        	pstmt.close(); 
	        	
	        	
	        	
	        	
	        	pstmt = conn.prepareStatement("insert into tb_user(id,phone,password,company,consumer,access,createdate,logindate) VALUES (?,?,?,?,?,?,?,?)");
	        	pstmt.setString(1, IDUtils.genItemId());
	        	pstmt.setString(2, userList.get(i).getPhone());
	        	pstmt.setString(3, MD5Utils.MD5(userList.get(i).getPassword()));
	        	pstmt.setString(4, userList.get(i).getCompany());
	        	pstmt.setString(5, userList.get(i).getConsumer());
	        	pstmt.setString(6, userList.get(i).getAccess());
	        	pstmt.setString(7, trans(userList.get(i).getCreatedate()));
	        	pstmt.setString(8, trans(userList.get(i).getLogindate()));
	        	
	        	pstmt.executeUpdate(); 
	        }
	      
            //conn.commit();  // 提交
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
		return year + "-" + yue + "-" + ri + " " + "00" + ":" + "00";
	}
	

}
