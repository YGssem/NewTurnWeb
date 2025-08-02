package module01_to_07;

// (Ex0602) 산술연산자 (2) : 괄호()부터 실행됨. 예상하듯이.

public class Ex0602 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		int x = a + b - (2 / 2) + c; // 5
		int y = a + (b - 2) / (2 + c); // 1
		System.out.println("x = " + x + ", y = " + y);
	}
}
