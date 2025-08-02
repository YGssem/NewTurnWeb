package module16_to_18;

import java.util.Arrays;

// (Ex1801) 2차원 배열.

public class Ex1801 {
	public static void main(String[] args) {
		int[][] arr;
		arr = new int[2][3]; // → 이해 : 순서대로, [2] = 행의 크기, [3] = 열의 크기.
		arr[0][0] = 10; // → 아래방향(행) 0번, 오른쪽방향(열) 0번.
		arr[0][1] = 20; // → 아래방향(행) 0번, 오른쪽방향(열) 1번.
		arr[0][2] = 30; // → 아래방향(행) 0번, 오른쪽방향(열) 2번.
		arr[1][0] = 40; // → 아래방향(행) 1번, 오른쪽방향(열) 0번.
		arr[1][1] = 50; // → 아래방향(행) 1번, 오른쪽방향(열) 1번.
		arr[1][2] = 60; // → 아래방향(행) 1번, 오른쪽방향(열) 2번.
		
		System.out.println(Arrays.toString(arr[0])); // arr[0] : 1차원배열을 의미. (고급)
		System.out.println(Arrays.toString(arr[1])); // arr[1] : 1차원배열을 의미. (고급)
	}
}
