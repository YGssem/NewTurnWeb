package module33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex3303 {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "db_test";
		String dbPw = "pass1234";
		
		// 1. Connection 얻기.
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
		
		// 2. Statement 준비.
		String sql = "SELECT * FROM member";  //→ 주의 : 문자열 따옴표 안에 세미콜론(;) 없어야 함.
		Statement stmt = conn.createStatement();
		
		// 3. 실행(SELECT문) → 결과집합(ResultSet)
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			System.out.println(id + " / " + pw + " / " + name);
		}
		
		// 끝내기 전에, 반드시 사용 종료 : ①rs ②stmt ③conn
		rs.close();
		stmt.close();
		conn.close();
	}
}








