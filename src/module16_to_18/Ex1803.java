package module16_to_18;

// (Ex1803) 2차원 배열의 출력 (1)

public class Ex1803 {
	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		// 1) i : 행 번호(인덱스), j : 열 번호(인덱스)
		for(int i=0; i<=2; i++) { // i : 0 ~ 2
			for(int j=0; j<=2; j++) { // j : 0 ~ 2
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// 2) i : 행 번호(인덱스), j : 열 번호(인덱스)
		for(int i=0; i<=2; i++) { // i : 0 ~ 2
			System.out.print("[");
			for(int j=0; j<=2; j++) { // j : 0 ~ 2
				System.out.print(arr[i][j] + (j<2 ? " " : ""));
			}
			System.out.println("]");
		}
	}
}
