package module16_to_18;

import java.util.Arrays;

// (Ex1701) 크기가 10인 배열 생성 후, 10, 20, 30, …, 100 까지를 담아서 출력.

public class Ex1701 {
	public static void main(String[] args) {
		// 생성#1.
		int[] arr1 = new int[10];
		for(int i=0; i<=9; i++) {
			arr1[i] = (i+1)*10;
		}
		
		// 생성#2. → 정석적인 이 방법은, 두 문장으로 쪼갤 수 있음.
		int[] arr2;
		arr2 = new int[] { 10,20,30,40,50,60,70,80,90,100 };
		
		// 생성#3. (간편법) → '간편법'은 두 문장으로 쪼갤 수 없음.
		int[] arr3 = { 10,20,30,40,50,60,70,80,90,100 };
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
