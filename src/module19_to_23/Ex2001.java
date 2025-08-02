package module19_to_23;

import java.util.Scanner;

// (Ex2001) 파라미터로 전달받은 3개의 정수 중 최대 값을 리턴하는 메서드.

public class Ex2001 {
	// max(n1, n2, n3) : 파라미터로 전달받은 3개의 정수 중 최대 값을 리턴하는 메서드.
	static int max(int n1,int n2,int n3) {
		if(n1>n2 && n1>n3) return n1;
		if(n2>n1 && n2>n3) return n2;
		return n3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		System.out.println("최대 값 = " + max(a,b,c));
	}
}
