package module28;

// (Ex2801) 인스턴스변수와 클래스변수, 그리고 인스턴스메서드와 클래스메서드.

class A {
	int n2; 		// "인스턴스변수"
	static int n3; 	// "클래스변수"
	void m() { 		// "인스턴스메서드"
		System.out.println("이 객체의 n2 = " + n2);
	}
	static void m3() { // "클래스메서드"
		System.out.println("이 클래스의 n3 = " + n3);
	}
}

public class Ex2801 {
	public static void main(String[] args) { // "클래스메서드"
		A a1 = new A();
		a1.n2 = 10; // "인스턴스변수"의 사용 → "참조변수."으로 접근.
		a1.m(); 	// 이 객체의 n2 = 10
		A.n3++; 	// "클래스변수"의 사용 → "클래스이름."으로 접근.
		A.m3(); 	// 이 클래스의 n3 = 1
		
		A a2 = new A();
		a2.n2 = 20; // "인스턴스변수"의 사용 → "참조변수."으로 접근.
		a2.m(); 	// 이 객체의 n2 = 20
		A.n3++; 	// "클래스변수"의 사용 → "클래스이름."으로 접근.
		A.m3(); 	// 이 클래스의 n3 = 2
	}
}