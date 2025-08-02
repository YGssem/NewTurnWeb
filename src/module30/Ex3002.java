package module30;

// (Ex3002) super 키워드 : 상위클래스(부모클래스) 객체를 가리킴.

class A {
	void m() {
		System.out.println("Parent m.");
	}
}
class B extends A {
	@Override
	void m() {
		System.out.println("Child m.");
		super.m();  // → 부모클래스 객체의 m() 메서드 호출.
	}
}

public class Ex3002 {
	public static void main(String[] args) {
		B obj = new B();
		// A obj = new B(); → 실행결과가 달라지지 않음. (뒤에서 자세히. '다형성')
		obj.m();
	}
}
