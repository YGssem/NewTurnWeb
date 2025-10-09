// (Ex3503.java / A.java) [참고] protected 접근제어자
package module35.pack2;

import module35.pack1.A;

class A2 extends A {
	void m2() {
		m();  // → 다른 패키지에 있는 자식클래스에서 protected 메서드에 접근O
	}
}
public class Ex3503 {
	public static void main(String[] args) {
		A2 obj = new A2();
		obj.m2();
		// obj.m();  → ERR. 다른 패키지에 있는 (자식클래스가 아닌) 클래스에서는 protected 메서드에 접근X
	}
}
