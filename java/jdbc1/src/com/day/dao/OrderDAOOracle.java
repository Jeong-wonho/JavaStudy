package com.day.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.day.dto.Customer;
import com.day.dto.OrderInfo;
import com.day.dto.OrderLine;
import com.day.dto.Product;
import com.day.exception.AddException;
import com.day.exception.FindException;
import com.day.sql.MyConnection;

public class OrderDAOOracle implements OrderDAO {

	@Override
	public void insert(OrderInfo info) throws AddException {
		Connection con = null;
		try {
			con = MyConnection.getConnection();
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AddException(e.getMessage());
		}
		try {
			insertInfo(con, info); // 기본정보!
			insertLines(con, info.getLines()); // 상세 정보!
			con.commit(); //commit
		}catch(Exception e) {
			try {
				con.rollback(); //rollback
			} catch (SQLException e1) {

			}
			throw new AddException(e.getMessage());
		}
		finally {
		
			MyConnection.close(con, null, null);
		}
	}

	private void insertInfo(Connection con, OrderInfo info) throws AddException {
		// SQL 송신
		PreparedStatement pstmt = null;
		String insertInfoSQL = "INSERT INTO order_info(order_no, order_id)" + " VALUES (ORDER_SEQ.NEXTVAL, ?)";
		try {
			pstmt = con.prepareStatement(insertInfoSQL);
			pstmt.setString(1, info.getOrder_c().getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AddException("주문 기본 정보 추가 실패:" + e.getMessage());
		} finally {
			MyConnection.close(null, pstmt, null);
		}
	}

	private void insertLines(Connection con, List<OrderLine> lines) throws AddException {
		PreparedStatement pstmt = null;
		String insertLineSQL = "INSERT INTO order_line(order_no, order_prod_no, order_quantity)\r\n"
				+ "VALUES (ORDER_SEQ.CURRVAL, ?, ?)";
		try {
			pstmt = con.prepareStatement(insertLineSQL);
			for (OrderLine line : lines) {
				pstmt.setString(1, line.getOrder_p().getProd_no());
				pstmt.setInt(2, line.getOrder_quantity());
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AddException("주문 상세 정보 추가 실패:" + e.getMessage());
		} finally {
			MyConnection.close(null, pstmt, null);
		}

	}

	@Override
	public List<OrderInfo> selectByID(String id) throws FindException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		String selectByIdSQL = "SELECT oi.order_no, order_dt, order_prod_no,  prod_name, prod_price, order_quantity \r\n" + 
				"FROM order_info oi JOIN order_line ol ON(oi.order_no = ol.order_no)\r\n" + 
				"JOIN product p  ON (ol.order_prod_no = p.prod_no)\r\n" + 
				"WHERE order_id = ?\r\n" + 
				"ORDER BY oi.order_no DESC, order_prod_no\r\n" + 
				"";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<OrderInfo> list = new ArrayList<>();
		try {
			pstmt = con.prepareStatement(selectByIdSQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				int order_no = rs.getInt("order_no");
				java.sql.Date order_dt = rs.getDate("order_dt");
				String order_prod_num = rs.getString("order_prod_no");
				String prod_name = rs.getString("prod_name");
				int prod_price = rs.getInt("prod_price");
				int order_quantity = rs.getInt("order_quantity");
				
				Product p = new Product(rs.getString("order_prod_no"), rs.getString("prod_name"), rs.getInt("prod_price"));
				// rs.getString("order_prod_no") 어떻게 prod로 바꾸지..?!
				
				OrderLine ol = new OrderLine(rs.getInt("order_no"), p, rs.getInt("order_quantity"));
				List<OrderLine> ol_list = new ArrayList<>();
				ol_list.add(ol);
				
				OrderInfo oi = new OrderInfo(order_no, null, order_dt, ol_list);
				list.add(oi);
				
//				List<OrderLine> ol_list = new ArrayList<>();
//				OrderLine ol = new OrderLine(order_prod_num, order_quantity);
//				ol_list.add(ol);
//				
//				
//				OrderInfo oi = new OrderInfo(order_no, order_dt);
				
				list.add(oi);
				
				
			}
			if(list.size() == 0) {
				System.out.println("주문 목록이 없습니다.");
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

	public static void main(String[] args) {
		OrderDAOOracle dao = new OrderDAOOracle();
//
//		OrderInfo info = new OrderInfo();
//		Customer c = new Customer();
//		c.setId("id1");
//
//		info.setOrder_c(c);
//
//		List<OrderLine> lines = new ArrayList<>();
//		for (int i = 1; i <= 3; i++) {
//			OrderLine line = new OrderLine();
//			Product p = new Product();
//			p.setProd_no("C000" + i);
//			line.setOrder_p(p);
//			line.setOrder_quantity(i);
//			lines.add(line);
//		}
//		info.setLines(lines);
//
//		try {
//			dao.insert(info);
//		} catch (AddException e) {
//			e.printStackTrace();
//		}
//	}
		String order_id = "id1";
		List<OrderInfo> list;
		try {
			list = dao.selectByID(order_id);
			System.out.println(list);
			System.out.println("총 주문횟수: " + list.size()); //2
		} catch (FindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

}
}
