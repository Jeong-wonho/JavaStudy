package com.day.dao;

import java.util.List;

import com.day.dto.OrderInfo;
import com.day.exception.AddException;
import com.day.exception.FindException;

public interface OrderDAO {
	/**
	 * 주문추가한다. 주문 기본정보 추가와 상세 정보들을 추가한다.
	 * @param info
	 * @throws AddException
	 */
	void insert (OrderInfo info) throws AddException;
	/**
	 * 주문검색한다.
	 * @param id
	 * @return
	 * @throws FindException
	 */
	List<OrderInfo> selectByID(String id) throws FindException;
	
}
