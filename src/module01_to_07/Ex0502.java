package module01_to_07;

// (Ex0502) 정수리터럴의 표현(10진수, 2진수, 16진수, 8진수)

public class Ex0502 {
	public static void main(String[] args) {
		byte b1 = 127; 			// → 10진수
		byte b2 = 0b01111111;  	// → 0b로 시작하면 2진수
		byte b3 = 0x7F; 		// → 0x로 시작하면 16진수
		byte b4 = 0177; 		// → 0으로 시작하면 8진수
								//   64가 1개, 8이 7개, 1이 7개 = 64+56+7 = 127
		
		b4++;  // → 'overflow' 라고 부르는 일이 발생!
		System.out.println(b4);  // → -128이 출력 (+128이 아님)
	}

}
