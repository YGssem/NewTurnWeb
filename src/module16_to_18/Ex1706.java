package module16_to_18;

// (Ex1706) 주어진 배열에서 최대 값을 출력.

public class Ex1706 {
	public static void main(String[] args) {
		int[] arr = { 5, 27, 9, -2, 13 };
		int max = arr[0]; // max : 내가 지금 최대 값이라고 가정하고 있는 수.
		for(int i=1; i<=4; i++) {
			// i=1 일 때, max = 5 vs arr[1] = 27 ----> max = 27
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
	}
}
