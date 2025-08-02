package module32;

// (Ex3201) 다형성의 이해. 

class AAA {
	void m() {
		System.out.println("부모클래스의 m메서드.");
	}
}

class BBB extends AAA {
	@Override
	void m() {
		System.out.println("자식클래스의 m메서드.");
	}
}

public class Ex3201 {
	public static void main(String[] args) {
		// BBB obj = new BBB();
		// obj.m();
		AAA obj = new BBB(); // '다형성 polymorphism'
		obj.m();
	}
}
