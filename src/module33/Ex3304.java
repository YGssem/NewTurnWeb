package module33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex3304 {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "db_test";
		String dbPw = "pass1234";
		
		// 1. Connection 객체 얻기.
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
				
		// 2. PreparedStatement 객체 준비. → 이제부터는 (Statement는 쓰지 말고)
		//								   PreparedStatement 객체만 사용하세요.
		String sql = "SELECT * FROM board ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);	
		
		// 3. SQL문 실행.
		ResultSet rs = pstmt.executeQuery();
		System.out.println("< 전체 게시글 보기 >");
		System.out.println("글번호\t제목\t내용\t작성자");
		System.out.println("----\t----\t----\t----");
		while(rs.next()) {
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			System.out.println(bno + "\t" + title + "\t" + content + "\t" + writer);
		}
		
		// 끝내기 전에 반드시 사용종료 : ①rs ②pstmt ③conn
		rs.close();
		pstmt.close();
		conn.close();
	}
}







