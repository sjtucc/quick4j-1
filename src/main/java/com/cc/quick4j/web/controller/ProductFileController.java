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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cc.quick4j.web.model.TbProduct;
@Controller
@RequestMapping("/productinfo")
public class ProductFileController {
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
		ArrayList<TbProduct> productList = new ArrayList<>();

		for(int i=1; i<=sheet1.getLastRowNum(); i++) {
			Row row = sheet1.getRow(i);
			if(row != null){
				TbProduct product = new TbProduct();
				if(row.getCell(0) != null) {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
			        product.setManufactures((row.getCell(0).getStringCellValue()));
			        product.setManufactures(new String(product.getManufactures().getBytes("GBK"),"ISO8859_1"));
				}
				if(row.getCell(1) != null) {
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
			        product.setModel((row.getCell(1).getStringCellValue()));
			    	product.setModel(new String(product.getModel().getBytes("GBK"),"ISO8859_1"));
				}
				if(row.getCell(2) != null) {
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
			        product.setPrice((row.getCell(2).getStringCellValue()));
				}
				if(row.getCell(3) != null) {
					row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
			        product.setAddress((row.getCell(3).getStringCellValue()));
			        product.setAddress(new String(product.getAddress().getBytes("GBK"),"ISO8859_1"));
				}
				if(row.getCell(4) != null) {
					row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
			        product.setGodate((row.getCell(4).getStringCellValue()));
				}
				if(row.getCell(5) != null) {
					row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
			        product.setDowndate((row.getCell(5).getStringCellValue()));
				}
				productList.add(product);
			} else {
				break;
			}
				
		}
		deleteData();
		
		goToSave(productList);
		
		
	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/store/productinfo.jsp"); 
		return mv;
	}
	

	
	private void goToSave(ArrayList<TbProduct> productList) throws Exception {
        PreparedStatement pstmt = null;  
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        try {
	       conn = DriverManager.getConnection("jdbc:mysql://120.26.136.231:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "wmt", "WMTwmt007");
        	// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "root", "111111");
	        conn.setAutoCommit(false); // 设置手动提交 
	        pstmt = conn.prepareStatement("insert into tb_product(id,manufactures,model,price,address,godate,downdate) VALUES (?,?,?,?,?,?,?)");
	        for(int i=0; i<productList.size(); i++) {
	        	pstmt.setString(1, UUID.randomUUID().toString());
	        	pstmt.setString(2, productList.get(i).getManufactures());
	        	pstmt.setString(3, productList.get(i).getModel());
	        	pstmt.setString(4, productList.get(i).getPrice());
	        	pstmt.setString(5, productList.get(i).getAddress());
	        	pstmt.setString(6, productList.get(i).getGodate());
	        	pstmt.setString(7, productList.get(i).getDowndate());
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
           // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/numysql?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8", "root", "111111");
            statement = conn.createStatement();
            statement.executeUpdate("delete from tb_product where 1=1");
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
