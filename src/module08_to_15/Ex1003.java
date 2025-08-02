package module08_to_15;

import java.util.Scanner;

// (Ex1003) 별 패턴.

public class Ex1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // "Scanner 객체 생성"
		System.out.print("n 입력 : ");
		int n = sc.nextInt(); // 정수 값을 입력받아서 변수 n에 저장
		
		for(int i=1; i<=n; i++) { // i : 행 번호
				// → i행에서 별을 i개만큼 출력(=별 하나 출력을 i번 반복)하면 됨
				// 1번째 행에서 별 1개 출력
				// 2번째 행에서 별 2개 출력
				// 3번째 행에서 별 3개 출력
				// …
			for(int j=1; j<=i; j++) { // j : 각 행에서 몇 번째 문자인지.
				System.out.print("*");
			} 	// → 결국, 이 j에 대한 for문은 "별을 i개만큼 출력"
				// i가 1일 때에는, 별을 1개 출력
				// i가 2일 때에는, 별을 2개 출력
				// i가 3일 때에는, 별을 3개 출력
				// …
			System.out.println();
		}
	}
}
