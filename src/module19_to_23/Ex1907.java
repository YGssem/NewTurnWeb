package module19_to_23;

import java.util.Scanner;

// (Ex1907) 메서드 연습2.

public class Ex1907 {
	static void showAllSum(int a, int b, int c) {
		System.out.println(a + " + " + b + " + " + c +" = " + (a+b+c));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		System.out.print("정수3 : ");
		int c = sc.nextInt();
		
		showAllSum(a,b,c);
	}
}
