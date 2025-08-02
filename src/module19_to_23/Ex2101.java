package module19_to_23;

// (Ex2101) 재귀호출.

public class Ex2101 {
	static void m() {
		System.out.print(".");
		m(); // → m() 메서드 안에서 m() 메서드를 호출 : "재귀호출"
	}
	public static void main(String[] args) {
		m();
	}
}
