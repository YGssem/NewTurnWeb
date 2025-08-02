package module01_to_07;

// (Ex0702) [고급] 비트연산자

public class Ex0702 {
	public static void main(String[] args) {
		System.out.println(0b0001 & 0b0011); // 1
		System.out.println(1 & 3); 			 // 1
		int a = 2;
		System.out.println((a-1) & (a+1)); 	 // 1
		System.out.println();

		// ~연산자 :
		byte b = 0b00000111; 	// 0b로 시작 = 2진수. 00000111
		System.out.println(~b); // 11111000 : -8 [고급]

		// [고급] :
		byte b2 = (byte)0b11110111; // -9 [고급]
				// 00000000 00000000 00000000 11110111
		System.out.println(~b2);	// 00001000 → 8 (이해)
	}
}
