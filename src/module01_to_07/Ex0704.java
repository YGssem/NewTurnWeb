package module01_to_07;

// (Ex0704) 증감연산자 (2)

public class Ex0704 {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(num++);	// 5 (이해)
		System.out.println(num); 	// 6 (이해)
		int num2 = num;
		System.out.println(--num); 	// 5 (이해)
		System.out.println(num2); 	// 6
	}
}
