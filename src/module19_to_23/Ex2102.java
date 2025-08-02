package module19_to_23;

// (Ex2102) 재귀호출(기본) : factorial

public class Ex2102 {
	// 메서드 f : 파라미터 n의 팩토리얼을 구해서 리턴하는 메서드(재귀호출).
	static int f(int n) { // 예를 들어, f(5) → 5!
		if(n==0)
			return 1;
		return n * f(n-1); // 예를 들어 이 문장은, return 5 * f(4); → return 5 * 4! ;
	}
	
	// 메서드 f2 : 파라미터 n의 팩토리얼을 구해서 리턴하는 메서드(반복문 사용).
	static int f2(int n) {
		int mul = 1;
		for(int i=1; i<=n; i++) {
			mul *= i;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		System.out.println("4! : " + f(4)); // 4! : 24
		System.out.println("5! : " + f2(5)); // 5! : 120
	}
}
