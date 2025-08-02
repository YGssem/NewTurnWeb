package module08_to_15;

// (Ex1301) 피보나치 수열.

public class Ex1301 {
	public static void main(String[] args) {
		int a = 1; // 첫 번째 항
		int b = 1; // 두 번째 항
		int c;
		System.out.print(a + " "); // 첫 번째 항 출력.
		System.out.print(b + " "); // 두 번째 항 출력.
		for(int i=3; i<=10; i++) { // 반복문 → 세 번째 ~ 열 번째 항 출력.
			// c 계산
			c = a + b;
			// c 출력
			System.out.print(c + " ");
			// a, b 이동
			a = b;
			b = c;
		}
	}
}
