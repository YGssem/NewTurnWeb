package module33;

import java.sql.DriverManager;

public class Ex3301 {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "hr";
		String dbPw = "hr";
		
		System.out.println("<< JDBC 오라클 접속 테스트 >>");
		
		Class.forName(driver);
		DriverManager.getConnection(url, dbId, dbPw);
		
		System.out.println("테스트 정상종료.");
	}
}
