// (Ex3702.java) 인터페이스의 상속.
package module37;

interface I01 { //→ 인터페이스 I01의 구성은 추상메서드1개.
	void m1();
}
interface I2 extends I01 { //→ "인터페이스의 상속" → 인터페이스 I2의 구성은 추상메서드 2개.
	void m2();
}
class I2Impl implements I2 {
	@Override // 추상메서드를 '구현'할 때, Override 애노테이션. (선택적이지만 권장함)
		public void m1() {
	}
	@Override // 추상메서드를 '구현'할 때, Override 애노테이션. (선택적이지만 권장함)
		public void m2() {
	}
}
public class Ex3702 {
	public static void main(String[] args) {
	}
}
