package module16_to_18;

// (Ex1704) 난수 발생 연습.

public class Ex1704 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		
		// 1. 출력.
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println(); // 줄바꿈.
		
		// 2. 평균 출력.
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			sum += arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.println("평균 : " + avg);
		
		// 3. 평균보다 큰 요소들 출력.
		System.out.print("평균보다 큰 요소 : ");
		for(int n : arr) {
			if(n>avg) {
				System.out.print(n + " ");
			}
		}
	}
}
