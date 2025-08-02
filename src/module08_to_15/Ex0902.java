package module08_to_15;

import java.util.Scanner;

// (Ex0902) 입력받은 횟수만큼 반복.

public class Ex0902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번을 반복할까요? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i + "번 반복.");
		}
		System.out.println("반복 끝.");
	}
}
