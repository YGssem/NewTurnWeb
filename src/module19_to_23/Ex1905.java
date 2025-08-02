package module19_to_23;

// (Ex1905) '파라미터의 구성'이 다르면, 메서드의 이름이 같아도 됨.

public class Ex1905 {
	static void m1() {
		System.out.println("m1.");
	}
	static void m2(int p) {
		p *= 2;
		System.out.println(p);
	}
	static void m2(int a, int b) { // → 9행의 메서드와 이름이 같으나 파라미터의 구성은 다름.
		System.out.println("또 다른 메서드.");
	}
	public static void main(String[] args) {
		m1();
		m2(5); // 이해 : 9행의 메서드를 실행할까요, 13행의 메서드를 실행할까요?
	}
}
