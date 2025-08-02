package module16_to_18;

// (Ex1703) 배열을 특정 형식으로 출력하고 홀수와 짝수의 개수를 출력

public class Ex1703 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<=4; i++) {
			arr[i] = (int)(Math.random() * 10) + 1; // 1 ~ 10
		}
		
		System.out.print("(");
		for(int i=0; i<=4; i++) {
			System.out.print(arr[i]);
			if(i<4) {
				System.out.print(" ");
			}
		}
		System.out.println(")");
		
		int cnt = 0; // 홀수의 개수
		for(int n : arr) { // for-each문
			if(n%2 != 0) {
				cnt++;
			}
		}
		// → 홀수의 개수 : cnt
		//	 짝수의 개수 : 5-cnt
		System.out.println("홀수:"+cnt+"개, 짝수:"+(5-cnt)+"개");
	}
}
