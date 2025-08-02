package module16_to_18;

import java.util.Arrays;

// (Ex1710) [고급] 버블정렬(Bubble Sort)

public class Ex1710 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 2, 1 };
		for(int i=4; i>=1; i--) { // i : 4 ~ 1 (이해)
			for(int j=0; j<=i-1; j++) { // j : 0 ~ i-1 (이해)
				// 둘을 비교 : [j] vs [j+1]
				// → 왼쪽이 더 크면, 왼쪽과 오른쪽을 서로 교환함.
				if(arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr)); // 출력해서 오름차순 정렬 상태 확인.
	}
}
