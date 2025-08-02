package module25;

// (Ex2501) Point 클래스 연습.

class Point {
	// → 여기에, 이 클래스의 구성 요소를 정의함.
	//   이 클래스의 구성은, 변수 2개(x, y).
	int x;
	int y;
}

public class Ex2501 {
	public static void main(String[] args) {
		Point point1; // "참조변수의 선언"
		point1 = new Point(); // "객체 생성" 후 참조변수와 연결.
		// → (고급) "Point 객체를 생성해서 그 참조값을 point1에 대입."
		// → (고급) 이해 : 참조변수가 기억하는 것은 '참조값'.
		point1.x = 1;
		// → "참조변수.변수" 란,
		//   해당 참조변수가 가리키는 객체 안에 있는 해당 변수.
		point1.y = 1;
		
		Point point2; // "참조변수의 선언"
		point2 = new Point(); // "객체 생성" 후 참조변수와 연결.
		point2.x = 5;
		point2.y = 4;
		
		System.out.println("점#1 : (" + point1.x + "," + point1.y + ")");
		System.out.println("점#2 : (" + point2.x + "," + point2.y + ")");
	}
}
