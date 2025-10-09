// (Ex3705.java) [참고] 디폴트메서드와 스태틱메서드
package module37;

interface I9 {
	void m1();
	default void m2() { // '디폴트메서드'
		System.out.println("이미 완성되어 있는 m2.");
	}
	static void m3() { // '스태틱메서드'
		System.out.println("이미 완성되어 있는 m3.");
	}
}
class I9Impl implements I9 {
	@Override
	public void m1() {
		System.out.println("구현클래스에서 완성한 m1.");
	}
}

public class Ex3705 {
	public static void main(String[] args) {
		I9 obj = new I9Impl(); // 父-子의 상황에서 '父'의 역할을 할 수 있음.
		obj.m1();
		obj.m2();
		// obj.m3(); → ERR. 인터페이스의 '스태틱메서드'는 "참조변수."으로 접근X
		// → 인터페이스의 '스태틱메서드'는 "인터페이스이름."으로 접근해야만 함!
		I9.m3();
	}
}