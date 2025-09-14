package module33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex3305 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("< 게시글 입력 테스트 >");
		System.out.print("글번호 : ");
		int bno = sc.nextInt();
		sc.nextLine(); // 입력버퍼 비움
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		System.out.print("작성자ID : ");
		String writer = sc.nextLine();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "db_test";
		String dbPw = "pass1234";
		
		// 1. Connection 객체 얻기.
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
		
		// 2. PreparedStatement 객체 준비.
		String sql = "INSERT INTO board VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno); //→ 1번째 물음표에 bno 값을 대입.
		pstmt.setString(2, title); //→ 2번째 물음표에 title 값을 대입.
		//→ PreparedStatement 사용시 주의 : 홑따옴표(') 처리는 자동으로 되는 것이므로, 우리가 홑따옴표(')를 써주면 에러!
		pstmt.setString(3, content); //→ 3번째 물음표에 content 값을 대입.
		pstmt.setString(4, writer); //→ 4번째 물음표에 writer 값을 대입.
		
		// 3. SQL문 실행.
		pstmt.executeUpdate();
		System.out.println("게시글이 등록되었습니다.");
		
		// 끝내기 전에 반드시 사용종료 : ①pstmt ②conn
		pstmt.close();
		conn.close();
	}
}
















