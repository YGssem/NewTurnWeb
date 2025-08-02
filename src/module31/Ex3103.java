package module31;

// (Ex3103) 부모클래스와 자식클래스의 생성자 호출 및 실행 순서.

class A5 {
	int num;
	A5() {
		System.out.println("생성자#1 실행됨.");
	}
	A5(int num) {
		System.out.println("생성자#2 실행됨.");
		this.num = num;
	}
}

class B5 extends A5 {
	int num2;
	B5(int num) {
		super(10); // → (생성자 첫줄에서) 부모클래스 생성자를 호출.
		num2 = 100;
		System.out.println("생성자#3 실행됨.");
	}
	B5(int num, int num2) {
		this(10); // → (생성자 첫줄에서) '내 옆에 있는 생성자'를 호출.
		this.num2 = num2;
		System.out.println("생성자#4 실행됨.");
	}
}

public class Ex3103 {
	public static void main(String[] args) {
		B5 obj = new B5(10,20); // → 23행의 생성자를 호출.
		System.out.println(obj.num + ", " + obj.num2);
	}
}
