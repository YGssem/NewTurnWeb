package module19_to_23;

// (Ex1903) 메서드의 파라미터와 인수

public class Ex1903 {
	static void m(int n) { 	// int n → "파라미터(parameter. 매개변수)" → 변수 선언입니다.
							// → m 메서드는 호출 받을 때 데이터를 함께 받도록 설계된 것.
		System.out.println("m 메서드 실행. 파라미터 n =" + n);
	}
	static void sayHello(String name) { // → 파라미터는 '변수의 선언'으로 합니다.
		// TODO : 실행결과를 보고 여기에 코드 작성.
	}
	static void oneToNum(int b) { // → 파라미터는 '변수의 선언'으로 합니다.
		// TODO : 실행결과를 보고 여기에 코드 작성.
	}
	public static void main(String[] args) { // → 이 args도 '파라미터' 입니다. (참고)
		m(5); 	//→ 이 메서드를 호출할 때에는 반드시 int값을 함께 보내야만 함. (이해)
				//  여기서 5 는 파라미터에게 보내주는 데이터 : "인수(argument. 인자)"

		// m(); // ERR (이해) → 파라미터에 전달할 인수가 없어서.
		
		// m("YG"); // [고급] ERR (이해) → String 에서 int로 자동 형 변환 x 니까.
		
		// TODO : 아래 실행 결과, "YG님, 안녕하세요"가 출력되도록 메서드 정의.
		sayHello("YG");
		
		// TODO : 아래 실행 결과, "1 2 3 4 5 "가 출력되도록 메서드 정의.
		oneToNum(5);
	}
}
