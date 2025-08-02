package module16_to_18;

import java.util.Arrays;

// (Ex1802) 2차원배열의 ‘간편법’

public class Ex1802 {
	public static void main(String[] args) {
		// 2차원배열의 '간편법' :
		int[][] arr = {
			{10, 20, 30},
			{40, 50, 60}
		};
		System.out.println(Arrays.toString(arr[0])); // → arr[0]은 1차원배열을 의미.
		System.out.println(Arrays.toString(arr[1])); // → arr[1]도 1차원배열을 의미.
	}
}
