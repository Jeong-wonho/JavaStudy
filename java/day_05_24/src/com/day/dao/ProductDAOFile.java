package com.day.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.day.dto.Product;
import com.day.exception.FindException;

public class ProductDAOFile implements ProductDAO {
	private String fileName = "products.txt"; // S0001:�����ó�Ʈ:1000:200101
	// S0002:��������:1500:210430
	// I0001:������:1000:201210

	@Override
	public List<Product> selectAll() throws FindException {
		/*
		 * 1. �����б�!(FileInputStream�� ������ Scanner ���)
		 * 2. ���� ������ ":" �����ڷ� 5�� ���ڿ��� �ڸ���(Split)
		 * 3. ��ǰ��ȣ, ��ǰ���� ����/ ��ǰ��ȣ�� int�� ��ȯ/ �������ڴ� Date�� ��ȯ
		 * 4. ��ǰ������ Product��ü�� ����
		 * 5. List�� Product��ü�� �߰�.
		 */
		List<Product> list = new ArrayList<>();
		Scanner sc = null;
		try {

			sc = new Scanner(new FileInputStream(fileName));
			while (true) { // ���ϳ��� ex: S0001:������ ��Ʈ:~~~~
				String line = sc.nextLine(); // next �����̳� �� �ٹٲ��� ������ ������´�.( �ܾ�� ������ ���ڳ�)
				String[] data = line.split(":", 5);
				// data[0] - ��ǰ��ȣ, data[1] = ��ǰ�̸�, data[2] = ��ǰ����, data[3] = ��������

				//StringTokenizer st = new StringTokenizer(line, ":");
				//while(st.hasMoreTokens()) {
				//String token = st.nextToken(); // �ǹ̸� ������ �ִ� ���ڿ��� ������ �´�.!
				//}
				
				String prod_no = data[0];
				String prod_name = data[1];
				int prod_price = -1;
				try {
					prod_price = Integer.parseInt(data[2]);

				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				Date prod_mf_dt = new Date();
				try {
					prod_mf_dt = new SimpleDateFormat("yyMMdd").parse(data[3]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String prod_detail = data[4];
				Product p = new Product(prod_no, prod_name, prod_price, prod_mf_dt, prod_detail);
				list.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FindException("������ ã�� �� �����ϴ�.");
		} catch (NoSuchElementException | IllegalStateException e) {

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		return list;
	}

	@Override
	public ProductDAO selectByNo(String prod_no) throws FindException {
// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Product> selectAll(int currentPage) throws FindException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> selectByName(String word) throws FindException {
// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOFile();
		try {
			List<Product> all = dao.selectAll();
			System.out.println(all);
		} catch (FindException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}
