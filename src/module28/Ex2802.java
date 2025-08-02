package module28;

// (Ex2802) 클래스메서드에서 인스턴스멤버에 접근 금지!

class Point {
	int x; // 인스턴스변수
	int y; // 인스턴스변수
	static int cnt = 0; // 클래스변수 → 모든 객체가 공유하는 '공통변수'의 역할
		// → cnt : 객체(Point 객체)의 수를 저장할 변수. 이는 모든 Point객체들이 공유할 변수로 사용
		//   하기 위해, 클래스변수로 선언함.
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		cnt++; 	// → 객체가 생성될 때마다 클래스변수 cnt의 값이 1씩 증가함.
	}
	static void showMe() { // 클래스메서드
		// System.out.println( "점 객체(" + x + "," + y + ")" ); // ERR.
		// → ★ "클래스메서드에서 인스턴스변수에 접근 금지!" (기억)
	}
	static void showCnt() { // 클래스메서드
		System.out.println("Point 객체의 수 = " + cnt);
	}
}

public class Ex2802 {
	public static void main(String[] args) {
		Point.showCnt(); // 0
		Point p1 = new Point(1,1);
		Point.showCnt(); // 1
		Point p2 = new Point(5,4);
		Point.showCnt(); // 2

		p1.showMe();
		p2.showMe();
	}
}
