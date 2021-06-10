package com.day.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.day.dto.Product;
import com.day.exception.FindException;
import com.day.sql.MyConnection;

public class ProductDAOOracle implements ProductDAO {
	public ProductDAOOracle() throws Exception {
		// jdbc드라이버 로드
//		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 드라이버 로드 성공");

//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			return;
//		}
	}
	//값을 전달할 목적의 객체 DTO (번호~ 일자)
	@Override
	public List<Product> selectAll() throws FindException {
		// DB연결
		Connection con = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		
		String selectALLSQL = "SELECT * FROM product ORDER BY prod_no ASC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();
		try {
			pstmt = con.prepareStatement(selectALLSQL);
			rs = pstmt.executeQuery(); 
			//rs.next()이동한 위치에 행이 존재하면 true를 반환하고 , 행이 존재하지 않으면 false를 반한한다.
			while (rs.next()) {
				//행의 컬럼값 얻기
				String prod_no = rs.getString("prod_no");
				String prod_name = rs.getNString("prod_name");
				int prod_price = rs.getInt("prod_price");
				java.sql.Date prod_mf_dt = rs.getDate("prod_mf_dt");
				
				Product p = new Product(prod_no, prod_name, prod_price, prod_mf_dt, null);
				list.add(p);
			}
			
			if(list.size() == 0) {
				throw new FindException("상품이 없습니다.");
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			throw new Exception(e.getMessage());
			throw new FindException(e.getMessage());
		} finally {
			//DB연결 해제
			MyConnection.close(con, pstmt, rs);
			//finally가 실행되고 return이 실행된다.
		}

	}


	@Override
	public List<Product> selectAll(int currentPage) throws FindException {
		// TODO Auto-generated method stub
		int cnt_per_page = 4;
		Connection con = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectAllPageSQL = "SELECT *\r\n" + 
				"FROM (SELECT rownum rn, a.*\r\n" + 
				"           FROM   (SELECT *\r\n" + 
				"                        FROM order_view \r\n" + 
				"                        --WHERE order_dt BETWEEN '21/01/01' AND '21/03/31' \r\n" + 
				"                        ORDER BY order_no DESC\r\n" + 
				"                       ) a\r\n" + 
				"          )\r\n" + 
				"WHERE rn BETWEEN START_ROW(?, ?) AND  END_ROW(?, ?)" + 
				"";
		try {
			pstmt = con.prepareStatement(selectAllPageSQL);
			pstmt.setInt(1, currentPage);
			pstmt.setInt(2, cnt_per_page);
			pstmt.setInt(3, currentPage);
			pstmt.setInt(4, cnt_per_page);
			rs = pstmt.executeQuery();
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				int rn = rs.getInt("RN");
				int order_no = rs.getInt("ORDER_NO");
				java.sql.Date order_dt = rs.getDate("ORDER_DT");
				int order_quantity = rs.getInt("order_quantity");
				String id = rs.getString("ID");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String prod_no = rs.getString("prod_no");
				String prod_name = rs.getString("prod_name");
				int prod_price = rs.getInt("prod_price");
				java.sql.Date prod_mf_dt = rs.getDate("prod_mf_dt");
				
				Product p = new Product(prod_no, prod_name, prod_price, prod_mf_dt, null);
				list.add(p);
			}
			//list_size확인
			System.out.println(list.size());
			
			if (list.size()==0) {
				throw new FindException("상품이 없습니다.111");
			}
			
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}finally {
			MyConnection.close(con, pstmt, rs);
		}

	}

	
	@Override
	public List<Product> selectByNo(String prod_no) throws FindException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sqlbynoquery = "select * from product where prod_no = ?";
		try {
			pstmt = con.prepareCall(sqlbynoquery);
			pstmt.setNString(1, prod_no);
			rs = pstmt.executeQuery();
			List<Product> list = new ArrayList<>();
			while(rs.next()) {
				String prod_n = rs.getString("prod_no");
				String prod_name = rs.getNString("prod_name");
				int prod_price = rs.getInt("prod_price");
				java.sql.Date prod_mf_dt = rs.getDate("prod_mf_dt");
				
				Product p = new Product(prod_n, prod_name, prod_price, prod_mf_dt, null);
				list.add(p);
			}
			
			if (list.size()==0) {
				throw new FindException("상품이 없습니다.111");
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}finally {
			MyConnection.close(con, pstmt, rs);
		}
		
	}

	@Override
	public List<Product> selectByName(String word) throws FindException {
		// TODO Auto-generated method stub
		Connection con = null;
		//db연결
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();
		String sqlByNameSQL = "SELECT * FROM PRODUCT WHERE prod_name LIKE ? ORDER BY prod_no";
		
		//SQL 구문 송신, 수신
		try {
			pstmt = con.prepareStatement(sqlByNameSQL);
			pstmt.setString(1, "%"+word+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String prod_no = rs.getString("prod_no");
				String prod_name = rs.getString("prod_name");
				int prod_price = rs.getInt("prod_price");
				java.sql.Date prod_mf_dt = rs.getDate("prod_mf_dt");
				
				Product p = new Product(prod_no, prod_name, prod_price, prod_mf_dt, null);
				list.add(p);
			}
			if(list.size() ==0) {
				throw new FindException("상품이 없습니다.");
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}finally {
			//DB 연결 해제
			MyConnection.close(con, pstmt, rs);
		}
		
	}
	
	public static void main(String[] args) {
		String word = "리";
		System.out.println("\""+word + "\"단어를 포함한 상품목록");
		try {
			ProductDAOOracle dao = new ProductDAOOracle();
//			List<Product> all = dao.selectByNo("F0001");
			List<Product> all = dao.selectByName(word);
			for(Product p: all) {
				System.out.println(p); //p.toString()자동 호출 됨.
			}
		}catch(FindException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
