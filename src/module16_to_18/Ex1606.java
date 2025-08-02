package module16_to_18;

import java.util.Arrays;

// (Ex1606) for-each문과 배열의 요소 변경.

public class Ex1606 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, -1, 2, 5 };

		// 1. for-each문은 배열의 각 요소를 꺼내어 보는 데에 편리하나,
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();

		// 2. for-each문으로 배열의 내용을 변경할 수는 없음. (이해)
		for(int n : arr) {
			n = n < 0 ? -n : n;  // → 이해 : 음수(마이너스값)의 부호를 (+)로 바꾸려는 것.
		}
		System.out.println(Arrays.toString(arr));
	}
}
