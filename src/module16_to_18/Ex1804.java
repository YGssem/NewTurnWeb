package module16_to_18;

// (Ex1804) 2차원 배열의 출력 (2)

public class Ex1804 {
	public static void main(String[] args) {
		int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		for(int i=0; i<=2; i++) {
			for(int j=0; j<=2; j++) {
				arr[i][j] *= 10; // 또는 arr[i][j] = arr[i][j] * 10;
			}
		}
		for(int i=0; i<=2; i++) { // i : (행 인덱스) 0 ~ 2
			System.out.print("[");
			for(int j=0; j<=2; j++) { // j : (열 인덱스) 0 ~ 2
				System.out.print(arr[i][j] + (j<2 ? " " : ""));
			}
			System.out.println("]");
		}
	}
}
