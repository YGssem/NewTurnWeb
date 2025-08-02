package module31;

// (Ex3101) '8글자' means "super();"
// ※ 자식클래스의 첫째줄에서는 부모클래스의 생성자를 호출해줘야 합니다.
class A {
	A() {
		System.out.println("A 생성자 실행됨");
	}
}

class B extends A {
	B() {
		// 자식클래스의 첫째줄에서 부모클래스의 생성자를 호출해줘야 함.
		super(); // '8글자' → 부모클래스의 생성자(파라미터가 0개인 생성자)를 호출.
		System.out.println("B 생성자 실행됨");
	}
}

public class Ex3101 {
	public static void main(String[] args) {
		B b = new B();
	}
}
