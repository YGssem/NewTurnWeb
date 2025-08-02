package module19_to_23;

// (Ex2103) String 클래스의 메서드 length() / charAt() / substring()

public class Ex2103 {
	public static void main(String[] args) {
		String s = "문자열A";
		System.out.println("문자열의 길이 : " + s.length());
		
		char ch = s.charAt(1); // 두 번째 글자 : '자'
		System.out.println("두 번째 글자 : " + ch);
		
		ch = s.charAt(s.length()-1); // 마지막 글자 : 'A'
		System.out.println("마지막 글자 : " + ch);
		
		String s2 = s.substring(1); // 이해 : 1부터 시작해서 끝까지.
		System.out.println("1부터 끝까지 : " + s2);
		
		String s3 = s.substring(1,3); // 이해 : 1부터 시작해서 3-1=2까지.
		System.out.println("1부터 3-1까지 : " + s3);
	}
}
