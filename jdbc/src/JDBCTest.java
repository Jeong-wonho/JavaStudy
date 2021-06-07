
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest {

	public static void testUPDATE() {

		// db연결
		// 자동 커밋 해제 con.setAutocommit(false);
		Connection con = null;

		try {
			con = com.day.sql.MyConnection.getConnection();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return;
		}

		// sql구문 송신

		String updateSQL = "UPDATE customer SET name = '테스트' WHERE name LIKE '%n%' ";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			int rowcnt = stmt.executeUpdate(updateSQL);
			System.out.println("총" + rowcnt + "건의 이름이 \'테스트\'로 변경되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void testINSERT() {

		// db연결
		Connection con = null;
		try {
			con = com.day.sql.MyConnection.getConnection();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return;
		}

		// sql구문 송신
		String insertSQL = "INSERT INTO customer(id, pwd, name) VALUES ('id9', 'p9', 'n9')";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			int rowcnt = stmt.executeUpdate(insertSQL);
			if (rowcnt == 1) { // 결과 활용
				System.out.println("id9번 고객 추가 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		// sql 결과 수신
		// 결과 활용
		// db연결 닫기
	}

	public static void testSELECT() {
		// 3.DB연결
		Connection con = null;
		try {
			con = com.day.sql.MyConnection.getConnection();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return;
		}

		// sql구문을 담은 String 변수 selectSQL
		String selectSQL = "SELECT employee_id, " + "first_name, " + "hire_date, " + "salary, "
				+ "salary+(salary*NVL(commission_pct, 0)) 실급여 " + "FROM employees";
		// 4.sql구문을 db에 송신
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeQuery(selectSQL);
			System.out.println("SQL구문을 DB에 송신");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 결과 수신
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectSQL);
			System.out.println("SQL구문을 DB에 종신, 결과 수신");

			while (rs.next() == true) { // 결과행의 커서를 다음행으로 이동시킨다. // true 결과행의 처음부터 마지막까지 반복시킨다.
				int emp_id = rs.getInt("employee_id");
				String f_name = rs.getString(2);
				java.sql.Date hire_dt = rs.getDate("hire_date");
				int sal = rs.getInt("salary");
				float real_sal = rs.getFloat("실급여");
				System.out.println(emp_id + ":" + f_name + ":" + hire_dt + ":" + sal + ":" + real_sal);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//db 연결해제
			com.day.sql.MyConnection.close(con, stmt, rs);
		}
	}



	public static void testINSERT(String id, String pwd, String name) {

		// db연결
		Connection con = null;
		try {
		con = com.day.sql.MyConnection.getConnection();
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return;
		}

		// sql구문 송신
		String insertSQL = "INSERT INTO customer(id, pwd, name) VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(insertSQL);

			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);

			// int rowcnt = pstmt.executeUpdate(insertSQL);
			int rowcnt = pstmt.executeUpdate();
			
			if (rowcnt == 1) { // 결과 활용
				System.out.println(id + "번 고객 추가 성공");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		// sql 결과 수신
		// 결과 활용
		// db연결 닫기
	}

	public static void testSELECT(String id) {
		// 3.DB연결
		Connection con = null;
		try {
		con = com.day.sql.MyConnection.getConnection();
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return;
		}

		// sql구문을 담은 String 변수 selectSQL, ?표는 값의 위치에만 올 수 있다.
		String selectSQL = "SELECT id, pwd, name " + "FROM customer WHERE id = ?";
		// 4.sql구문을 db에 송신
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = con.prepareStatement(selectSQL);
			pstmt.setString(1, id);
			System.out.println("SQL구문을 DB에 송신");
			
			// 결과를 수신.
			rs = pstmt.executeQuery();
			System.out.println("SQL구문을 DB에 종신, 결과 수신");
			if (rs.next()) {
				String userid = rs.getString("id");
				String userpwd = rs.getString("pwd");
				String username = rs.getString("name");
				System.out.println(userid + ":" + userpwd + ":" + username);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (rs != null) {
				// db와 연결 해제 열었던 순서대로
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void testUPDATE(String idValue, String pwdValue, String nameValue) {
		String updateSQL = null;

		// sql구문 송신
		if (!pwdValue.isEmpty() && !nameValue.isEmpty()) { // pwd, name 둘다 null이 아니면 둘다 바궈줘야해
			updateSQL = "UPDATE customer SET pwd = '" + pwdValue + "', name = '" + nameValue + "' WHERE id ='"
					+ idValue + "'";

		} else if (!pwdValue.isEmpty()) {
			updateSQL = "UPDATE customer SET pwd = '" + pwdValue + "' WHERE id ='" + idValue + "'";

		} else if (!nameValue.isEmpty()) {
			updateSQL = "UPDATE customer SET name = '" + nameValue + "' WHERE id ='" + idValue + "'";

		}
		else {
			System.out.println("아무것도 변경되지 않았습니다.");
		}
		sql_update(updateSQL);
		
	}

	public static void sql_update(String updateSQL) {
		Connection con = null;
		try {
		con = com.day.sql.MyConnection.getConnection();
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return;
		}
		Statement stmt = null;
		try {
			
			stmt = con.createStatement();
			int rowcnt = stmt.executeUpdate(updateSQL);
			if (rowcnt == 1)
			System.out.println("변경되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			com.day.sql.MyConnection.close(con, stmt, null);
			//없는부분은 null값을 넣어 주면 됩ㄴ디ㅏ.!
		}
	}

	// 1.JDBC드라이버 설치(OJDBC6.JAR)
	public static void testUPDATE_teacher(String id, String pwd, String name) {
		//DB연결
		Connection con = null;
		try {
		con = com.day.sql.MyConnection.getConnection();
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			return;
		}
		//SQL구문 송신
		String updateSQL = 
				"UPDATE customer SET ";

		if(!"".equals(pwd) && !"".equals(name)) { //비번도 변경, 이름도 변경한 케이스
			updateSQL += "pwd='" + pwd +"', name='" +name +"'";

		}else if(!"".equals(name)) { //비번은 변경안함, 이름변경
			updateSQL += "name='" +name +"'";

		}else {
			updateSQL += "pwd='" +pwd +"'";
		}
		//마지막에 문자열 추가!
		updateSQL += " WHERE id=?"; //고정값에 써주는게 좋구나.!
		
		System.out.println("update:"+updateSQL);
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(updateSQL);
			pstmt.setString(1, id);
			int rowcnt = pstmt.executeUpdate();
			if(rowcnt == 1) {
				System.out.println(id+"고객의 내용이 변경되었습니다");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	// db 연결 메서드

	public static void main(String[] args) {
		// 2. jdbc드라이버 로드
		try {
			// jdbc드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 로드 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

//		testSELECT();
//		testINSERT();
//		testUpdate();

		// 키보드로 입력받은 id, pwd, name 값을 customer 테이블에 추가
//		Scanner sc = new Scanner(System.in);
//		System.out.println("아이디:");
//		String idValue = sc.nextLine();
//		System.out.println("비밀번호:");
//		String pwdValue = sc.nextLine();
//		System.out.println("이름:");
//		String nameValue = sc.nextLine();
//		testINSERT(idValue, pwdValue, nameValue);

		Scanner sc = new Scanner(System.in);
		System.out.println("아이디:");
		String idValue = sc.nextLine();
		testSELECT(idValue);

		System.out.print("비밀번호를 변경하려면 값을 입력하세요[변경안하려면 : enter를 누르세요]:");
		String pwdValue = sc.nextLine(); // enter를 누른경우 pwdValue 변수값은 ""가 된다.
		System.out.println("입력한 비밀번호값:[" + pwdValue + "]");
		System.out.print("이름을 변경하려면 값을 입력하세요[변경안하려면 : enter를 누르세요]:");
		String nameValue = sc.nextLine();
		testUPDATE_teacher(idValue, pwdValue, nameValue);
		
	
		// 비번이 있는 경우 비번을 변경, 이름이 있는 경우 이름을 변경
		// 비번, 이름이 둘다 있는 경우 둘다 변경, 둘 다 없으면 둘 다 변경하지 않음!
	}

}
