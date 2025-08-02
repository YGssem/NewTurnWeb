package module01_to_07;

// (Ex0303) 실수의 사용에는 오차가 따름 (1).

public class Ex0303 {
	public static void main(String[] args) {
		System.out.println(0.1 + 0.2); // 0.30000000000000004
					// → 실수의 사용에는 오차가 따름. 이 값은 누가 봐도 0.3 이므로,
					//	 이렇게 오차가 발생한 값을 보아도 당황하지 말고, 그냥 0.3
					//	 과 같은 값이라고 보면, 오케이! 그 차이는 신경쓰지 말 것!
		System.out.println(0.2 + 0.3); // 0.5
					// → 실수의 사용에 반드시 오차가 따르는 것은 아님.
		System.out.println(1.1 + 2.2); // 3.3000000000000003
					// → (7행 설명과 마찬가지.)
		System.out.println(1.1 + 2.4); // 3.5
					// → (11행 설명과 마찬가지.)
	}
}
