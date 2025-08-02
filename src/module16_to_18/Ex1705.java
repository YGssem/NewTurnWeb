package module16_to_18;

import java.util.Arrays;
import java.util.Scanner;

// (Ex1705) 크기가 6인 배열에 입력받은 정수가 존재하는지 여부를 판별.

public class Ex1705 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(n) 입력 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[6];
		for(int i=0; i<=5; i++) {
			arr[i] = (int)(Math.random()*11) -5;
			// → 이 범위(-5 ~ +5)의 정수를 만들어내기 위해서,
			//   먼저 이 범위 (-5부터 +5까지)를 (0부터 +10까지)로 조정.
			// → (int)(Math.random()*11)
			// → 이제 여기에 -5 를 하면, '-5 이상 +5 이하의 정수'가 됨.
		}
		boolean found = false; // 없다고 가정하고 시작.
		for(int num : arr) { // for-each문
			if(n == num) {
				found = true;
				break;
			}
		}
		System.out.println("배열 : " + Arrays.toString(arr) + " -> " + n + " " +
							(found ? "있" : "없") + "음!");
	}
}
