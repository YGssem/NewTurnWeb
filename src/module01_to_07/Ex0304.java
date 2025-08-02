package module01_to_07;

// (Ex0304) [고급] 실수의 사용에는 오차가 따름 (2). (실수의 동등비교 주의)
// ※ for : 반복문입니다. 뒤에서 배우므로, 여기서는 가볍게 동등비교 결과만 확인하세요.

public class Ex0304 {
	public static void main(String[] args) {
		int a = 0;
		double b = 0;
		for(int i=1; i<=10; i++) { 	// → 반복문. (뒤에서 배움)
			a++; 	// a는 1씩 증가시킴.
			b+=0.1; // b는 0.1씩 증가시킴.
			System.out.print("b:" + b + " *10 == a:" + a + " --> ");
			System.out.println(b*10 == a);  // → == 은 값이 같은지 비교. (뒤에서)
		}
	}
}
