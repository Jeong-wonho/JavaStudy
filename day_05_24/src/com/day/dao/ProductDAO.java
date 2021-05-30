package com.day.dao;


import java.util.List;

import com.day.dto.Product;
import com.day.exception.FindException;

/*
- �߰��Ѵ�.
- ��ü ��ȸ�Ѵ�.
- ��ǰ��ȣ�� ��ȸ�Ѵ�.
- ��ǰ������ ��ȸ�Ѵ�.
*/
public interface ProductDAO  {
	
	/**
	 * ��ǰ ��ü �˻��Ѵ�.
	 * @param currentPage ������
	 * @return �������� �ش��ϴ� ��ǰ��
	 * @throws FindException ��ǰ�� ���� ��� �Ǵ� ��ǰã�⸦ ������ ��� �߻��Ѵ�.
	 */
	public List<Product> selectAll() throws FindException;
	public List<Product> selectAll(int currentPage) throws FindException;
	
	/**
	 * 
	 * @param prod_no ��ǰ��ȣ
	 * @return ��ǰ��ȣ�� �ش��ϴ� ��ǰ
	 * @throws FindException ��ǰ�� ���� ��� �Ǵ� ��ǰã�⸦ ������ ��� �߻�
	 */
	public ProductDAO selectByNo(String prod_no) throws FindException;
	
	/**
	 * 
	 * @param word ��ǰ�� �ش��ϴ� �ܾ�
	 * @return �ܾ ������ ��ǰ
	 * @throws FindException ��ǰ���� ���� ��� �Ǵ� ��ǰã�⸦ �߻��� ���
	 */
	public List<Product> selectByName(String word) throws FindException;
}