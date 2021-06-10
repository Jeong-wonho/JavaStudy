package com.day.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.day.dto.Customer;
import com.day.exception.AddException;
import com.day.exception.DuplicatedException;
import com.day.exception.FindException;
import com.day.exception.ModifyException;
import com.day.exception.RemoveException;
import com.day.sql.MyConnection;

public class CustomerDAOOracle implements CustomerDAO {

	// 1.jdbc드라이버 로드
	public CustomerDAOOracle() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("JDBC 드라이버 로드 성공");
	}

	@Override
	public void insert(Customer c) throws AddException {
		// DB연결
		Connection con = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AddException(e.getMessage());
		}

		String insertAccountSQL = "INSERT INTO customer(id, pwd, name) VALUES (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(insertAccountSQL);
			pstmt.setString(1, c.getId());
			pstmt.setString(2, c.getPwd());
			pstmt.setString(3, c.getName());
			int rowcnt = pstmt.executeUpdate();
			if (rowcnt == 1) {
				System.out.println(c.getId() + "번 고객 추가 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AddException(e.getMessage());
		} finally {
			MyConnection.close(con, pstmt, null);
		}

	}

	@Override
	public Customer selectById(String id) throws FindException {
		// 2. db연결
		Connection con = null;
		Customer c = null;
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		// 3. sql구문 db에 송신
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sqlByIdquery = "SELECT * FROM customer WHERE id = ?";
		try {
			pstmt = con.prepareStatement(sqlByIdquery);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String user_id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String buildingno = rs.getString("buildingno");
				int enabled = rs.getInt("enabled");

				c = new Customer(user_id, pwd, name, buildingno, enabled);

			}

			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FindException(e.getMessage());

		} finally {
			MyConnection.close(con, pstmt, rs);
		}

	}

	@Override
	public void update(Customer c) throws ModifyException {

		Connection con = null;
		// db연결
		try {
			con = MyConnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ModifyException(e.getMessage());
		}
		// 구문송신에 필요한 변수들 설정
		PreparedStatement pstmt = null;

		// 쿼리문 작성
		String updateSQL = "UPDATE customer SET ";

		String pwd = c.getPwd();
		String name = c.getName();
		String buildingno = c.getBuildingno();
		int enabled = c.getEnabled();
		boolean flag = false;
		
		if (pwd != null && !pwd.equals("")) {
			updateSQL += "pwd='" + c.getPwd() + "' ";
			flag = true;
		}

		if (name != null && !name.equals("")) {
			if (flag) {
				updateSQL += ",";
			}
			updateSQL += "name='" + c.getName() + "' ";
			flag = true;
		}
		
		if (buildingno != null && !buildingno.equals("")) {
			if (flag) {
				updateSQL += ",";
			}
			updateSQL += "buildingno='" + c.getBuildingno() + "' ";
			flag = true;
		}
		
		if (enabled > -1) { // 0 탈퇴, 1 활동
			if (flag) {
				updateSQL += ",";
			}
			updateSQL += "enabled='" + c.getEnabled() + "' ";
			flag = true;
		}
		if (flag = false) {
			throw new ModifyException("실패");
		}

		else {
			updateSQL += "enabled =" + enabled + " ";
		}

		updateSQL += "WHERE id = ?";
		System.out.println("updatesql문:" + updateSQL);
		// sql 구문 송신, 수신
		try {
			pstmt = con.prepareStatement(updateSQL);
			System.out.println(updateSQL);
			pstmt.setString(1, c.getId());

			int rowcnt = pstmt.executeUpdate();
			if (rowcnt == 1) {
				System.out.println(c.getId() + "데이터가 업데이트 되었습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ModifyException(e.getMessage());
		} finally {
			MyConnection.close(con, pstmt, null);
		}

	}

	public static void main(String[] args) {
		// 회원가입용 문구 (duplicated 오류 발생 해결해야해!)
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		String id = sc.nextLine();
		System.out.println("pwd를 입력하세요");
		String pwd = sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("건물명을 입력하세요");
		String buildingno = sc.nextLine();
//		
		Customer c = new Customer();
		c.setId(id);
		c.setEnabled(0);
		c.setPwd(pwd);
		c.setName(name);
		c.setBuildingno(buildingno);
		try {
			CustomerDAOOracle dao = new CustomerDAOOracle();
//			dao.insert(c); // 회원가입용
//			List<Customer> all = dao.selectById(id); // 정보확인용
//			for(Customer c: all) {
//				System.out.println(c);
//			}
//			dao.updateModify(c); 
			dao.update(c);
		} catch (DuplicatedException e) {
			e.printStackTrace();
		} catch (AddException e) {
			e.printStackTrace();
		} catch (FindException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
