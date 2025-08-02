package module19_to_23;

// (Ex1906) 메서드 연습1

public class Ex1906 {
	static void showAdd(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	static void showSub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	static void showMul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	static void showDiv(int a, int b) {
		System.out.println(a + " / " + b + " = " + ((double)a/b));
	}
	public static void main(String[] args) {
		showAdd(5, 3);
		showSub(5, 2);
		showMul(3, 4);
		showDiv(5, 4);
	}
}
