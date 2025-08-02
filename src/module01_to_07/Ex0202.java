package module01_to_07;

// (Ex0202) 자동 형 변환.

public class Ex0202 {
	public static void main(String[] args) {
		byte b = 3;  // → byte타입의 변수 b를 선언하고 3으로 초기화.
		short s = b; // → __ _ __이 일어나고 있음! (byte에서 short로)
					 // → b의 값을 변수 s에 저장함. 그런데 b는 byte 값이고
					 // 자동 형 변환 규칙에 의해 byte → short 로 자동 형 변환
					 // 되므로, short로 형 변환된 값이 변수 s에 저장됨.
		int i = s; 	 // → __ _ __이 일어나고 있음! (_____에서 _____로)
		long lo = i; // → __ _ __이 일어나고 있음! (_____에서 _____로)
		float f = lo; // → __ _ __이 일어나고 있음! (_____에서 _____로)
					 // → 여기서, 정수 값이 실수 값으로 변경됨.
					 // 정수 값이 실수 값으로 변경될 때에는, 뒤에 .0 이 붙음.
					 // 예를 들어, 3은 3.0으로 변경됨.
		double d = f; // → __ _ __이 일어나고 있음!
		System.out.println(d); // → 3? 아니면 3.0? (뭐가 출력될까요?)
	}
}
