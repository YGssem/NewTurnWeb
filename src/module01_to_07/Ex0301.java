package module01_to_07;

// (Ex0301) 변수의 표현범위

public class Ex0301 {
	public static void main(String[] args) {
		byte b1 = -128;
		System.out.println(b1); // -128
		// byte b2 = 128; // ERR.
				// → byte의 표현범위는 -128부터 +127까지이므로, +128이라는 값은 byte
				//   타입의 변수에 담을 수 없음.
		byte b3 = 127;
		System.out.println(b3); // 127
	}
}
