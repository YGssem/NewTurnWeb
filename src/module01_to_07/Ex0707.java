package module01_to_07;

// (Ex0707.java) 쉬프트연산자 (1) : <<

public class Ex0707 {
	public static void main(String[] args) {
		int a = 0x00000002; 	// 00000000 00000000 00000000 00000010
		a = a << 1; 			// 00000000 00000000 00000000 00000100
		System.out.println(a); 	// 4
		a = a << 2; 			// 00000000 00000000 00000000 00010000
		System.out.println(a); 	// 16
	}
}
