package module34;

class A3 {
}

public class Ex3403 {
	public static void main(String[] args) {
		A3 obj = new A3();
		
		String s = obj.toString(); // Object클래스에 정의된 toString() 실행.
		System.out.println(s);
		
		String s2 = "YG";
		System.out.println(s2);
		System.out.println(s2.toString());
		
		System.out.println(s==s2); // 참조값 비교
		System.out.println(s.equals(s2)); // 내용 비교
					// → String클래스에 오버라이딩된 equals() 실행. (내용 비교)
					// → [참고] Object클래스의 equals()는 '참조값' 비교.
	}
}
