package module26;

// (Ex2603) 생성자 오버로딩.

class ClassA {
	// → 여기에, 이 클래스의 구성을 정의함.
	//   이 클래스의 구성은, 변수3개 + 생성자2개 + 메서드1개.
	int a;
	int b;
	double c;
	
	ClassA(int pa, int pb, double pc) { // → 생성자#1
		a = pa;
		b = pb;
		c = pc;
	}
	ClassA(int pa, int pb) { // → 생성자#2
		a = pa;
		b = pb;
		c = 10.0;
	}
	void show() {
		System.out.println("show : " + a + " / " + b + " / " + c);
	}
}

public class Ex2603 {
	public static void main(String[] args) {
		ClassA obj = new ClassA(1, 2, 3.0); // → 이해: 어떤 생성자를 호출?
		// → ①참조변수 선언 ②객체 생성 ③생성자 호출표현 + 변수와 객체를 연결.
		obj.show();
		obj = new ClassA(1, 2); // → 이해: 어떤 생성자를 호출?
		// → ①객체 생성 ②생성자 호출표현 + 변수와 객체를 연결.
		obj.show();
	}
}
