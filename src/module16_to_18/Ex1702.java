package module16_to_18;

import java.util.Arrays;
import java.util.Scanner;

// (Ex1702) 과목 수 입력 후에 각 과목의 점수를 입력받고, 총점과 평균을 출력.

public class Ex1702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 수 입력 : ");
		int n = sc.nextInt(); // n : 과목수
		int[] arr = new int[n]; // arr : 점수 배열 (길이가 n인 배열)
		System.out.print("점수를 입력하세요: ");
		for(int i=0; i<=n-1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("입력한 점수 : " + Arrays.toString(arr));
		
		int total = 0;
		for(int i=0; i<=n-1; i++) {
			total += arr[i];
		}
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + (total/n) + "점"); // 정수형 나눗셈
	}
}
