package com.cc.quick4j.web.controller;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cc.quick4j.core.util.TaotaoResult;
import com.cc.quick4j.web.model.TbOrder;
import com.cc.quick4j.web.model.TbRoute;
import com.cc.quick4j.web.model.TbUser;
@Controller
@RequestMapping("/routeinfo")
public class RouteFileController {
	/**
	 * @author chenchen
	 * @title 读取excel，存数据库
	 */
	
	@RequestMapping("/dealExcel")
	@ResponseBody
	public TaotaoResult dealExcel(
		//HttpServletRequest request,
        //@RequestParam("uploadfile") CommonsMultipartFile file) throws Exception{
		@RequestParam(value = "files") MultipartFile [] files, HttpServletRequest request, HttpServletResponse response) throws Exception{
		MultipartFile file = files[0];
	
		InputStream fis = file.getInputStream();
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet1 = workbook.getSheetAt(0);/** 得到第一个sheet */
		int len = sheet1.getLastRowNum();
		ArrayList<TbRoute> routeList = new ArrayList<>(len+1);

		for(int i=1; i<=len; i++) {
			Row row = sheet1.getRow(i);
			if(row != null){
				TbRoute route = new TbRoute();
				if(row.getCell(0) != null) {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					route.setFromadd(row.getCell(0).getStringCellValue());
					route.setFromadd(new String(route.getFromadd().getBytes("GBK"),"ISO8859_1"));
				} else {
					route.setFromadd("");
				}
				if(row.getCell(1) != null) {
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
					route.setDestadd(row.getCell(1).getStringCellValue());
					route.setDestadd(new String(route.getDestadd().getBytes("GBK"),"ISO8859_1"));
				} else {
					route.setDestadd("");
				}
				if(row.getCell(2) != null) {
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
					route.setTrans(row.getCell(2).getStringCellValue());
					route.setTrans(new String(route.getTrans().getBytes("GBK"),"ISO8859_1"));
				} else {
					route.setTrans("");
				}
				if(row.getCell(3) != null) {
					row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
					route.setLprice(row.getCell(3).getStringCellValue());
				} else {
					route.setLprice("");
				}
				if(row.getCell(4) != null) {
					row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
					route.setHprice(row.getCell(4).getStringCellValue());
				} else {
					route.setHprice("");
				}
				routeList.add(route);
			} else {
				continue;
			}
				
		}
		deleteData(); //删除数据
		
		goToSave(routeList);
		
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("/store/showuser.html"); 
		//return mv;
		return TaotaoResult.ok();
	}
	


	private void goToSave(ArrayList<TbRoute> routeList) throws Exception {
        PreparedStatement pstmt = null;  
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
	       conn = DriverManager.getConnection("jdbc:mysql://120.26.136.231:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "wmt", "WMTwmt007");
	        conn.setAutoCommit(false); // 设置手动提交 
	        pstmt = conn.prepareStatement("insert into tb_route(id,fromadd,destadd,trans,lprice,hprice) VALUES (?,?,?,?,?,?)");
	        for(int i=0; i<routeList.size(); i++) {
	        	pstmt.setString(1, UUID.randomUUID().toString());
	        	pstmt.setString(2, routeList.get(i).getFromadd());
	        	pstmt.setString(3, routeList.get(i).getDestadd());
	        	pstmt.setString(4, routeList.get(i).getTrans());
	        	pstmt.setString(5, routeList.get(i).getLprice());
	        	pstmt.setString(6, routeList.get(i).getHprice());
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
	
	public void deleteData() throws Exception {
		Connection conn = null;
        Statement statement = null;        
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            conn = DriverManager.getConnection("jdbc:mysql://120.26.136.231:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "wmt", "WMTwmt007");  
            statement = conn.createStatement();
            statement.executeUpdate("delete from tb_route where 1=1");
        } catch (SQLException e) {  
            e.printStackTrace();  
        } finally {   
            if(statement != null) {  
            	statement.close();  
            	statement = null;  
            }  
            if(conn != null) {  
                conn.close();  
                conn = null;  
            }  
        }	
	}
	

}
