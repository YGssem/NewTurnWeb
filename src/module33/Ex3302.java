package module33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Ex3302 : JDBC로 SELECT문 실행(1)
public class Ex3302 {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "hr";
		String dbPw = "hr";
		
		System.out.println("<< JDBC 오라클 접속 테스트 >>");
		
		// 1. Connection 객체
		Connection conn = null;
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, dbId, dbPw);
		
		// 여기까지 '에러'가 없었으면: "접속"까지 된 것.
		System.out.println("오라클에 정상 접속됨.");
				
		// 2. Statement 객체
		String sql = "SELECT * FROM jobs";
		Statement stmt = conn.createStatement(); 
						// Statement 객체를 생성해서 리턴.
		
		// 3. ResultSet 객체
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			String jobId = rs.getString("job_id");
			String jobTitle = rs.getString("job_title");
			int minSal = rs.getInt("min_salary");
			int maxSal = rs.getInt("max_salary");
			System.out.println(jobId + " / " + jobTitle + " / "
								+ minSal + " / " + maxSal);
		}
		
		// 역순으로 정리.
		rs.close();
		stmt.close();
		conn.close();
	}
}











