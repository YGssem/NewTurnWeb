package module29;

// (Ex2901) 클래스의 상속 (1)

class Parent1 {
	int num = 5;
	void showNum() {
		System.out.println("num : " + num);
	}
}
// → 부모클래스(Parent1)의 구성은? = 필드1개 + 메서드1개.

class Child1 extends Parent1 {
	double num2 = 10.5;
	void showNum2() {
		System.out.println("num2 : " + num2);
	}
}
// → 자식클래스(Child1)의 구성은? = 필드2개 + 메서드2개.

public class Ex2901 {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.showNum(); // ①호출가능할까? ②실행결과는?
		obj.showNum2(); // ①호출가능할까? ②실행결과는?
	}
}
