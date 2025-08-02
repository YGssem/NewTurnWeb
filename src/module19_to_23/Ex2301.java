package module19_to_23;

// (Ex2301) 메서드 오버로딩.

public class Ex2301 {
	static int plus(int a, int b) {
		return a + b;
	}
	// static int plus(int c, int d) { } // ERR(메서드를 중복해서 정의한 것).

	static double plus(double a, double b) { // → '메서드 오버로딩'
		return a + b;
	}
	
	public static void main(String[] args) {
		int sum = plus(3,5); // → 둘 중 어떤 메서드가 호출될까? (이해)
		System.out.println(sum);
		
		double sum2 = plus(3.5,1.5); // → 둘 중 어떤 메서드가 호출될까? (이해)
		System.out.println(sum2);
	}
}
