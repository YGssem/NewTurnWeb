package module08_to_15;

import java.util.Scanner;

// (Ex0802) if문 (1)

public class Ex0802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		
		System.out.print(score + "점은 ");
		score/=10; 				// → 어려우면, "score = score / 10;" 이라 하세요.
		if(score>=9) { 			// → 90점대 혹은 100점인 경우. (이해)
		System.out.print("A학점");
		} else if(score>=8) { 	// → 80점대인 경우.
		System.out.print("B학점");
		} else if(score>=7) { 	// → 70점대인 경우.
		System.out.print("C학점");
		} else if(score>=6) { 	// → 60점대인 경우.
		System.out.print("D학점");
		} else { 				// → 그 밖의 점수대인 경우.
		System.out.print("F학점");
		}
		System.out.println("입니다.");
	}
}
