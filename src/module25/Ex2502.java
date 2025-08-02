package module25;

import java.util.Scanner;

// (Ex2502) Circle 클래스 연습

class Circle {
	// → 여기에, 이 클래스의 구성을 정의함.
	//   이 클래스의 구성 : 변수 1개 + 메서드 1개.
	int r; // r : 반지름
	void showArea() {
		System.out.println("반지름이 "+r+"인 원의 넓이는 "+(3.14*r*r)+" 입니다");
	}
}

public class Ex2502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성.
		System.out.print("원의 반지름 값을 입력하세요 : ");
		int input = sc.nextInt(); // Scanner 객체 안에 있는 메서드 nextInt()를 호출.
		
		Circle c1 = new Circle(); // 참조변수를 선언하고 객체 생성 후, 둘을 연결.
		c1.r = input; // 참조변수 c1이 가리키는 객체 안에 있는 변수 r에 대입함.
		c1.showArea(); // 참조변수 c1이 가리키는 객체 안에 있는 메서드 showArea() 호출.
	}
}
