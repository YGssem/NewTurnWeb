package module19_to_23;

// (Ex1902) 메서드 안에서 다른 메서드를 호출할 수 있음.

public class Ex1902 {
	static void methodB() {
		System.out.println("methodB 호출됨");
	}
	static void methodC() {
		System.out.print("methodC에서, ");
		methodB(); // 메서드 호출
	}
	public static void main(String[] args) {
		methodB(); // 메서드 호출
		// → 이 메서드가 호출되면, 이 메서드의 내용(2~4행)이 '실행'되며,
		//	 이 메서드의 실행이 완료(종료)되기 전에는 아래(11~12행)는 실행되지 않음.
		methodC(); // 메서드 호출
		System.out.println("(메인메서드 끝)");  // → 이것도 '메서드 호출'임.
	}
}
