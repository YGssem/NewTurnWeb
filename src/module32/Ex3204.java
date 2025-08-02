package module32;

// (Ex3204) "부-자는 되고, 자-부는 안 된다." → ①외우거나 ②이해하세요.

class A2 {
	void m() {
		System.out.println("m.");
	}
}

class B2 extends A2 {
	void m2() {
		System.out.println("m2.");
	}
}

public class Ex3204 {
	public static void main(String[] args) {
		A2 obj = new B2(); // "父-子 는 된다." (부-자는 된다)
		// B2 obj2 = new A2(); // ERR. // "子-父 는 안 된다." (자-부는 안 된다)

		obj.m();
		// obj.m2(); // ERR.
		((B2) obj).m2(); // '다운캐스팅'(형 변환)
	}
}
