package module19_to_23;

// (Ex1901) 메서드를 "정의" / "호출" → (호출하면 실행됨)

public class Ex1901 {
	//→ 여기서, 'Ex1901' 는 '클래스'라 부름. (항상 대문자로 시작해요.)
	static void a() { // a라는 이름의 메서드를 "정의"함.
		System.out.println("a 메서드가 실행됨.");
	}
	static void b() { // b라는 이름의 메서드를 "정의"함.
		System.out.println("b 메서드가 실행됨.");
	}
	public static void main(String[] args) {
		//→ 여기서 정의되고 있는 'main' 도 '메서드' 임. (소문자로 시작해요.)
		
		System.out.println("(main 메서드가 시작)");
		
		a(); // a 메서드를 "호출"함.
		a(); // a 메서드를 한번 더 "호출"함. (원하는 횟수만큼 호출할 수 있음.)
		b(); // b 메서드를 "호출"함.
		
		System.out.println("(main 메서드가 끝)");
	}
}
