package module29;

// (Ex2902) 클래스의 상속 (2)

class A { // → A클래스 = "부모클래스"
	void m1() {
		System.out.println("m1() 호출됨.");
	}
}
class B extends A { // → B클래스 = "자식클래스".
	// → "클래스B는 클래스A를 확장(상속)한다."
	// → "B클래스는 A클래스를 확장하는(extends A) 클래스."
	int num;
	B(int num) {
		this.num = num;
	}
	void showNum() {
		System.out.println("num : " + num);
	}
}

public class Ex2902 {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		
		B b = new B(10);
		b.showNum();
		b.m1(); // → 클래스B는 클래스A를 상속 받았으므로, B 객체에 m1() 메서드가 존재함.
	}
}
