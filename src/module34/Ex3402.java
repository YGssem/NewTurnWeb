package module34;

class A2 { // → 또는 "class A2 extends Object {"
	void m() { }
}
class B extends A2 {
}
class C extends B {
}

public class Ex3402 {
	public static void main(String[] args) {
		A2 a = new A2();
		System.out.println(a); // 파라미터(a)가 객체의 참조값 → a.toString()
	}
}
