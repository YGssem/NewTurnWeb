package module16_to_18;

import java.util.Arrays;

// (Ex1707) 배열의 최소 값.

public class Ex1707 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<=4; i++) {
			arr[i] = (int)(Math.random() * 9) + 1;
		}
		System.out.println("생성된 배열 : " + Arrays.toString(arr));
		
		int min = arr[0]; // min : 내가 지금 최소 값이라고 가정하고 있는 수.
		for(int i=1; i<=4; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min : " + min);
	}
}
