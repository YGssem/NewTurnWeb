package module01_to_07;

// (Ex0606) 문자열의 비교(2)

public class Ex0606 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);  // → 정확한 이해는 뒤에서. (==은 참조값 비교)
		System.out.println(s1.equals(s2)); // 문자열 내용의 동등비교는 .equals()
		System.out.println(s2.equals(s1)); // 문자열 내용의 동등비교는 .equals()
	}
}
