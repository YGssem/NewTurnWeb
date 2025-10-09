// (Ex3601.java) 추상클래스
package module36;

abstract class AC { // "추상클래스"의 정의.
					//→ "추상클래스". 클래스를 정의할 때 abstract 키워드를 붙이면, 이 클래스는 '추상클래스'가 됨.
	void m1() {
		System.out.println("m1.");
	}
	abstract void m2(); // "추상메서드"의 선언.
}

class BC extends AC {
	@Override
	void m2() {
		System.out.println("완성된 m2.");
	}
}
public class Ex3601 {
	public static void main(String[] args) {
		// AC obj = new AC(); → ERR. [이해]
		BC obj = new BC();
		obj.m1();
		obj.m2();
	}
}
