package module16_to_18;

import java.util.Arrays;

// (Ex1603) 배열의 출력

public class Ex1603 {
	public static void main(String[] args) {
		int[] arr; 			// → int형 배열을 가리킬 변수 arr을 선언.
		arr = new int[3]; 	// → 크기가 3인 int형 배열 생성 후 변수에 연결.
		arr[0] = 10; 		// → 배열의 첫 번째 항목의 인덱스는 (1이 아닌) 0.
		arr[1] = 20;
		arr[2] = 30;
		
		// 1. 배열 출력 : Arrays.toString() 사용.
		System.out.println("arr : " + Arrays.toString(arr));
		
		// 2. 배열 출력 : 반복문 사용.
		System.out.print("arr : ");
		for(int i=0; i<=2; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 3. 'for-each문' → 뒤에서 다시 다루므로, 지금은 가볍게 봐두세요.
		System.out.print("arr : ");
		for(int n : arr) { 	// 하나씩 n에 담은 채로 실행.
			System.out.print(n + " ");
		}
	}
}
