package com.day.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.day.dao.ProductDAO;
import com.day.dto.Product;
import com.day.exception.FindException;

public class ProductService {
	private ProductDAO dao;
	private static ProductService service = new ProductService();
	private ProductService() {
		//dao = new ProductDAOFile(); 
		//dao = new ProductDAOOracle();
		//dao = new ProductDAOMySQL();
		Properties env = new Properties();
		try {
			env.load(new FileInputStream("classes.prop"));
			String className = env.getProperty("productDAO");
			Class c = Class.forName(className);
			dao = (ProductDAO)c.newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ProductService getInstance() {
		return service;
	}
	
	public List<Product> findAll() throws FindException{
		return dao.selectAll();
	}
}
