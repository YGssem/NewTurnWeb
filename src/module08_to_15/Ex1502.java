package module08_to_15;

import java.util.Scanner;

// (Ex1502.java) 입력 버퍼를 비워야 할 경우
// ※ 한번 실행해 본 후에, 아래의 13번 행을 주석해제 하세요.

public class Ex1502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이와 이름을 차례대로 입력:");
		int age = sc.nextInt();
		// sc.nextLine(); //→ 입력버퍼를 비움. (실행결과 확인 후 주석해제)
		String name = sc.nextLine();
		
		System.out.println("입력된 나이 : " + age);
		System.out.println("입력된 이름 : " + name);
		
		sc.close(); // 권장.
	}
}