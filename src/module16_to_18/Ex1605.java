package module16_to_18;

import java.util.Arrays;

// (Ex1605) [고급] Arrays.clone() : 배열의 복제

public class Ex1605 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};

		int[] arr2 = arr.clone(); // 복제(shallow-copy)
		arr[0] = 1;
		System.out.print("arr:" + Arrays.toString(arr));
		System.out.println(" <-> arr2:" + Arrays.toString(arr2));
		System.out.println("arr 참조값 == arr2 참조값 : " + (arr == arr2)); // 참조값 비교
		System.out.println();
		
		// 이해 : 아래는 '복제'가 아님.
		int[] arr3 = arr;  //→ 배열을 '복제'한 게 아님.
		arr3[0] = 100;
		System.out.print("arr:" + Arrays.toString(arr));
		System.out.println(" = arr3:" + Arrays.toString(arr3));
		System.out.println("arr 참조값 == arr3 참조값 : " + (arr == arr3)); // 참조값 비교
	}
}
