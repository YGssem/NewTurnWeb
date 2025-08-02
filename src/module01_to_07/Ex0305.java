package module01_to_07;

// (Ex0305) 홑따옴표(')

public class Ex0305 {
	public static void main(String[] args) {
		char ch = 'A';
			// → 홑따옴표(')는 딱 하나의 문자를 표현할 때 쓰임. 홑따옴표(')에 의해 문자
			//   가 그에 대응되는 숫자로 변환됨.(기억) 즉, 이 문장은 char ch = 65; 이
			//   라고 쓰는 것과 같음.
		System.out.println(ch); // A 가 출력됨.
		char ch2 = 65;
			// → 결과적으로 7행과 같은 값이 변수에 저장됨.
		System.out.println(ch2); // (65가 아니라) A 가 출력됨. 왜 그럴까? (이해)
	}
}
