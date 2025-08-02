package module19_to_23;

// (Ex1912) 메서드의 리턴

public class Ex1912 {
	static void m1() {
		System.out.println("m1.");
	}
	static String m2() {
		return "m2."; // 리턴문의 실행 (이해)
		// System.out.println("이 문장이 실행될까?"); // ERR (이해)
	}
	public static void main(String[] args) {
		// 이해1. 아래는 되고, 그 아래는 안 됨.
		m1(); // → (O)
		// System.out.println(m1()); // ERR (이해)
		
		// 이해2. 메서드호출표현이 리턴값으로 변경됨.
		System.out.println( m2() ); // "m2()" → 이게 m2()의 리턴값으로 변경됨.
		//→ 즉, 이 문장은 System.out.println( "m2." ); 으로 변경되어 실행됨. (이해)
	}	
}
