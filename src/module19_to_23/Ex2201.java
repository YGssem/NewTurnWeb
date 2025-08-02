package module19_to_23;

// (Ex2201) 지역변수의 유효범위.

public class Ex2201 {
	static void m2(int p) { // p : '파라미터' → 파라미터는 지역변수임.
		// System.out.println(num); // ERR. 왜요? (이해)
									// → 변수 num은 main()에서 선언된 변수니까 main()에서만 쓸 수 있음.
		System.out.println(p);
	}
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) { // i는 지역변수
		}
		// System.out.println(i); // ERR. 만약 이게 가능하다면 6이 출력되었을 것. (이해)

		int num = 5; // num은 지역변수
		System.out.println(num);
		
		if(3>2) {
			int num2 = num; // num2는 지역변수
		}
		// System.out.println(num2); // ERR (이해).
		
		m2(55);
		// System.out.println(p); // ERR (이해).
	}
}
