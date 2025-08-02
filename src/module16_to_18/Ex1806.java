package module16_to_18;

// (Ex1806) 이렇게 생긴 2차원 배열도 가능 (참고).

public class Ex1806 {
	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3}, {4,5,6,7}, {8,9}
		};
		
		for(int i=0; i<=arr.length-1; i++) { // arr.length → 해설.
			for(int j=0; j<=arr[i].length-1; j++) { // arr[i].length → 해설.
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 줄바꿈.
		}
	}
}
