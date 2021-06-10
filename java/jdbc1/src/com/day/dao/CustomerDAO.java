package com.day.dao;

import java.util.List;

import com.day.dto.Customer;
import com.day.exception.AddException;
import com.day.exception.FindException;
import com.day.exception.ModifyException;

public interface CustomerDAO {
	/**
	 *  회원가입용
	 * @param c
	 * @throws AddException
	 */
	public void insert(Customer c) throws AddException;
	/**
	 *  회원정보조회용
	 * @param id
	 * @return
	 * @throws FindException
	 */
	public Customer selectById(String id) throws FindException;
	/**
	 * 회원 정보 수정 및 삭제
	 * @param c
	 * @throws ModifyException
	 */
	public void update(Customer c) throws ModifyException;
}
