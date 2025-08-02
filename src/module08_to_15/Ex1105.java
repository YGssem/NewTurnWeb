package module08_to_15;

import java.util.Scanner;

// (Ex1105) 가위 / 바위 / 보

public class Ex1105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) { // "무한반복문" → "탈출조건" 검토!
			System.out.print("입력(가위/바위/보) : ");
			String input = sc.next();
			if( input.equals("가위")==true ||
				// → 'input에 저장된 문자열이 "가위"와 같으면' 이라는 뜻.
				//    그러니까, 두 문자열의 내용을 비교할 때에는 .equals()를 씁니다.
				//    (==을 쓰면 안됩니다. input=="가위" 라고 하면 안돼요!)
				input.equals("바위")==true ||
				input.equals("보")==true ) {
				break;
			}
		}
		System.out.println("프로그램 정상 종료됨.");
	}
}
