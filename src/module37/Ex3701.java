// (Ex3701.java) 인터페이스.
package module37;

interface I1 {
	int num = 5; // → 체크 : (내가 안 썼어도) 무조건 "public static final"이 됨.
	void m(); // → 체크 : (내가 안 썼어도) 무조건 "public abstract"가 됨.
}
class I1Impl implements I1 {
	@Override // → 추상메서드를 구현할 때, @Override 애노테이션 (선택적이지만 권장함)
	public void m() {
		System.out.println("구현클래스에서 구현한 m.");
	}
}
public class Ex3701 {
	public static void main(String[] args) {
		// I1 obj = new I1(); → ERR. [이해] 인터페이스를 가지고 객체생성 할 수 없음.
		I1Impl obj = new I1Impl();
		obj.m();
		System.out.println("obj.num : " + obj.num);
		System.out.println("I1.num : " + I1.num);
							// → I1.num : static이므로 "인터페이스이름."으로 접근 가능. [이해]
		// obj.num = 10; → ERR. [이해] final이므로 값을 변경할 수 없음.
	}
}