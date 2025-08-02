package module01_to_07;

import java.util.Scanner;

// (Ex0706) 삼항연산자 (2)

public class Ex0706 {
	public static void main(String[] args) {
		// 스캐너 객체 생성 :
		Scanner sc = new Scanner(System.in);
		
		// 정수 값을 하나 입력. int형 변수 a에 대입 :
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		int abs = a>0 ? a: a*-1;  // → 또는 int abs = a>0 ? a : -a;
		System.out.println(a + "의 절대 값 = " + abs);
	}
}
