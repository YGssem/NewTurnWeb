package module01_to_07;

// (Ex0708) 쉬프트연산자 (2) : >>

public class Ex0708 {
	public static void main(String[] args) {
		int a = 128; 			// 00000000 00000000 00000000 10000000
		a = a >> 1; 			// 00000000 00000000 00000000 01000000
		System.out.println(a); 	// 64
	}
}
