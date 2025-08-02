package module08_to_15;

import java.util.Scanner;

// (Ex0803) switch문.

public class Ex0803 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		
		System.out.print(score + "점은 ");
		score/=10; 	// → 어려우면, "score = score / 10;" 이라 하세요.
		switch(score) {
		case 10:
		case 9:
			System.out.print("A학점");
			break; 	// → switch문에서 break를 만나면, switch문 밖으로 빠져나감 (32행으로 이동).
		case 8:
			System.out.print("B학점");
			break;
		case 7:
			System.out.print("C학점");
			break;
		case 6:
			System.out.print("D학점");
			break;
		default: 	// → (case로 언급하지 않은) 그 밖의 값인 경우
			System.out.print("F학점");
		}
		System.out.println("입니다.");
	}
}
