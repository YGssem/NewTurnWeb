package module32;

// (Ex3206) instanceof 연산자
// ※ [수정] A2를 A02로, B2를 B02로 변경하였습니다.

class A02 {
	void m1() {
		System.out.println("m1메서드 실행됨.");
	}
}

class B02 extends A02 {
	void m2() {
		System.out.println("m2메서드 실행됨.");
	}
}

public class Ex3206 {
	public static void main(String[] args) {
		A02 obj = new B02();
		obj.m1();
		// obj.m2(); // ERR. → 이해: 왜 안 되는지?

		if (obj instanceof B02) {
			// → obj instanceof B02 : "obj가 참조하는 객체가 B02 클래스의 인스턴스냐?"
			((B02) obj).m2();
		}
	}
}
