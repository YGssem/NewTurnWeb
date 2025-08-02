package module01_to_07;

// (Ex0501) 상수

public class Ex0501 {
	public static void main(String[] args) {
		final int num = 5;
		// num = 15; // ERR. 상수는 두 번 다시 그 값을 변경할 수 없음.
		System.out.println(num);
	}
}
