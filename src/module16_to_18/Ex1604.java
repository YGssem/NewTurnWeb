package module16_to_18;

import java.util.Arrays;

// (Ex1604) 배열에 값을 대입.

public class Ex1604 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		// → 크기가 10인 정수형 배열을 생성하고 선언된 변수에 연결.
		
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*6)+1;
		}

		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[] { 100, 300, 200 };
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = { 100, 300, 200 };  // → (간편법)
		System.out.println(Arrays.toString(arr3));
	}
}
