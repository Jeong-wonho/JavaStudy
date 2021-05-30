package com.day.dao;


import java.util.List;

import com.day.dto.Product;
import com.day.exception.FindException;

/*
- 추가한다.
- 전체 조회한다.
- 상품번호로 조회한다.
- 상품명으로 조회한다.
*/
public interface ProductDAO  {
	
	/**
	 * 상품 전체 검색한다.
	 * @param currentPage 페이지
	 * @return 페이지에 해당하는 상품들
	 * @throws FindException 상품이 없을 경우 또는 상품찾기를 실패한 경우 발생한다.
	 */
	public List<Product> selectAll() throws FindException;
	public List<Product> selectAll(int currentPage) throws FindException;
	
	/**
	 * 
	 * @param prod_no 상품번호
	 * @return 상품번호에 해당하는 상품
	 * @throws FindException 상품이 없을 경우 또는 상품찾기를 실패한 경우 발생
	 */
	public ProductDAO selectByNo(String prod_no) throws FindException;
	
	/**
	 * 
	 * @param word 상품명에 해당하는 단어
	 * @return 단어를 포함한 상품
	 * @throws FindException 상품명이 없을 경우 또는 상품찾기를 발생한 경우
	 */
	public List<Product> selectByName(String word) throws FindException;
}