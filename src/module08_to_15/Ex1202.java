package module08_to_15;

import java.util.Scanner;

// (Ex1202) 소수 판단 by ‘방법2’

public class Ex1202 {
	public static void main(String[] args) {
		// 1. 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수값 하나 입력 받아서 int n에 담고.
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		// 3. n에 담긴 값이 '소수(prime number)'인지 여부를 판단하여, 결과 출력.
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				System.out.println(n + "은(는) 소수가 아님.");
				break;
			}
			if(i == n-1) {
				System.out.println(n + "은(는) 소수임.");
			}
		}
	}
}
