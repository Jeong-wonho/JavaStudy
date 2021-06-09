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
	private String fileName = "products.txt"; // S0001:갤럭시노트:1000:200101
	// S0002:갤럭시탭:1500:210430
	// I0001:아이폰:1000:201210

	@Override
	public List<Product> selectAll() throws FindException {
		/*
		 * 1. 파일읽기!(FileInputStream을 가공한 Scanner 사용)
		 * 2. 한줄 내용을 ":" 구분자로 5개 문자열로 자르기(Split)
		 * 3. 상품번호, 상품명은 무관/ 상품번호는 int로 변환/ 제조일자는 Date로 변환
		 * 4. 상품정보를 Product객체로 생성
		 * 5. List에 Product객체를 추가.
		 */
		List<Product> list = new ArrayList<>();
		Scanner sc = null;
		try {

			sc = new Scanner(new FileInputStream(fileName));
			while (true) { // 파일내용 ex: S0001:갤럭시 노트:~~~~
				String line = sc.nextLine(); // next 공백이나 탭 줄바꿈을 만나면 가지고온다.( 단어별로 가지고 오겠네)
				String[] data = line.split(":", 5);
				// data[0] - 상품번호, data[1] = 상품이름, data[2] = 상품가격, data[3] = 제조일자

				//StringTokenizer st = new StringTokenizer(line, ":");
				//while(st.hasMoreTokens()) {
				//String token = st.nextToken(); // 의미를 가지고 있는 문자열만 가지고 온다.!
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
			throw new FindException("파일을 찾을 수 없습니다.");
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
