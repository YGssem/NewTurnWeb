package module01_to_07;

// (Ex0703) 증감연산자 (1)

public class Ex0703 {
	public static void main(String[] args) {
		int num = 5;
		num++;  // → 후위(postfix) 증감연산자.
				// → 변수명 뒤에 증감연산자가 놓이면 '후위 증감연산자'라고 함.
		++num;  // → 전위(prefix) 증감연산자.
				// → 변수명 앞에 증감연산자가 놓이면 '전위 증감연산자'라고 함.
		System.out.println(num);
		num--;
		--num;
		System.out.println(num);
	}
}
