// (Ex3504.java) final 키워드 정리.
package module35;

/*final*/ class A { // 주석#1
	/*final*/ void m() { } // 주석#2
}

class B extends A { // → 주석#1을 주석해제하면 ERR.
	@Override
	void m() { } // → 주석#2를 주석해제하면 ERR.
}

public class Ex3504 {
	public static void main(String[] args) {
		/*final*/ int num = 5; // 주석#3
		num++; // → 주석#3을 주석해제하면 ERR.
	}
}
