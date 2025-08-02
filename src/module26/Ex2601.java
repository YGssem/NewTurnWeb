package module26;

// (Ex2601) 생성자(Constructor)

class Point2 {
	//→ 여기에, 이 클래스의 구성을 정의함. 이 클래스의 구성은 변수2개와 생성자1개.
	int x;
	int y;
	Point2(int p1, int p2) { // 생성자의 역할 : 빈 '그릇'의 초기화.
		x = p1;
		y = p2;
	}
}
public class Ex2601 {
	public static void main(String[] args) {
		// Point2 p = new Point2(); // ERR. (이해) -- WHY?
		
		Point2 p1 = new Point2(1,1);
		// → ①참조변수 선언 ②객체 생성 ③생성자 호출표현
		// p1.x = 1; → (위 생성자 호출표현 덕분에, 이제 이렇게 할 필요가 없음)
		// p1.y = 1; → (위 생성자 호출표현 덕분에, 이제 이렇게 할 필요가 없음)
		
		Point2 p2 = new Point2(5,4);
		// → ①참조변수 선언 ②객체 생성 ③생성자 호출표현
		// p2.x = 5; → (위 생성자 호출표현 덕분에, 이제 이렇게 할 필요가 없음)
		// p2.y = 4; → (위 생성자 호출표현 덕분에, 이제 이렇게 할 필요가 없음)
		
		System.out.println("점#1 : " + p1.x + "," + p1.y);
		System.out.println("점#2 : " + p2.x + "," + p2.y);
	}
}
