package module19_to_23;

// (Ex1911) 리턴문의 실행 = ①호출한 쪽으로 리턴값을 되돌려줌 ②메서드 실행종료.

public class Ex1911 {
	static void say(String n) {
		System.out.println("Hello " + n + "!");
	}
	static String say2(String n) {
		return "Hello " + n + "!"; // 리턴문의 실행 (이해)
	}
	public static void main(String[] args) {
		say("YG");
		System.out.println(say2("YG"));
	}
}
