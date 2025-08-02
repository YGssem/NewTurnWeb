package module01_to_07;

// (Ex0709) [고급] 쉬프트연산자 (3) : >>와 >>>

public class Ex0709 {
	public static void main(String[] args) {
		int a = 0xffffff80; // 11111111 11111111 11111111 10000000 = -128
		a = a >> 1; 		// 11111111 11111111 11111111 11000000 = -64
		System.out.println(a);
		
		a = 0xffffff80; 	// 11111111 11111111 11111111 10000000 = -128
		a = a >>> 1; 		// 01111111 11111111 11111111 11000000
		System.out.println(a); // 출력값의 2진수 표현을 이해.
		
		a = 0x7fffffc0; 	// 01111111 11111111 11111111 11000000
		System.out.println(a); // 같은 값이 출력됨을 이해.
	}
}
