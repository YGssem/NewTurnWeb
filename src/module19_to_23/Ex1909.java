package module19_to_23;

import java.util.Arrays;

// (Ex1909) Arrays.toString()과 같은 형태로 배열을 출력.

public class Ex1909 {
	static void showArraysToString(int[] arr) {
		System.out.print("[");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]);
			if(i==arr.length-1) break;
			System.out.print(", ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		System.out.println(Arrays.toString(arr));
		showArraysToString(arr);
	}
}
