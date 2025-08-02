package module19_to_23;

import java.util.Scanner;

// (Ex1908) 배열을 메서드(의 파라미터)로 전달.

public class Ex1908 {
	static void showSum(int a, int b, int c) {
		System.out.print(a + " + " + b + " + " + c);
		System.out.println(" = " + (a+b+c));
	}
	static void showSum2(int[] arr) {
		System.out.print(arr[0] + " + " + arr[1] + " + " + arr[2]);
		System.out.println(" = " + (arr[0]+arr[1]+arr[2]));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		System.out.print("정수1 : ");
		arr[0] = sc.nextInt();
		System.out.print("정수2 : ");
		arr[1] = sc.nextInt();
		System.out.print("정수3 : ");
		arr[2] = sc.nextInt();
		
		showSum(arr[0],arr[1],arr[2]); // 메서드 호출시, 파라미터에 정수 값 3개를 전달.
		showSum2(arr); // 메서드 호출시, 파라미터에 배열(배열객체)을 전달.
	}
}
