package module30;

// (Ex3003) (참고) 변수에는 '오버라이딩'이 적용되지 않음. "Variable Hiding"
// ※ [수정] A2를 A3로, B2를 B3로 변경하였습니다.

class A3 {
	int num = 10;
}
class B3 extends A3 {
	int num = 20;
}

public class Ex3003 {
	public static void main(String[] args) {
		A3 obj = new B3(); // '다형성' 적용
		System.out.println(obj.num); // 10 (참조값의 타입이 A2일 때)
		System.out.println(((B3)obj).num); // 20 (참조값의 타입이 B2일 때)
		B3 obj2 = new B3();
		System.out.println(obj2.num); // 20 (참조값의 타입이 B2일 때)
		System.out.println(((A3)obj2).num); // 10 (참조값의 타입이 A2일 때)
	}
}
