package module01_to_07;

// (Ex0402) [고급] 그 외에 자동으로 형 변환되는 경우. (정수형 리터럴)
// ※ 이 예제는 어려우면 스킵해도 괜찮습니다.

public class Ex0402 {
	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 10;
		// byte b3 = b1 + b2; // ERR. (이해)
			// → b1 + b2의 연산 결과가 int형.
			// → int 값을 byte형 변수에 담을 수 없음. (자동 형 변환 안 됨.)
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		// 65 → int형 값.
		char ch = 65;
		// → [참고] 여기서 65는 int값일 필요가 없으므로 char형 값으로 변환됨.

		// char ch2 = ch + 32; // ERR. 이해.
		
		char ch3 = 'A' + 32;  // 이해 : 자동 형 변환이 됨.
		System.out.println(ch3);  // → 97에 대응되는 문자는 'a'.
	}
}
