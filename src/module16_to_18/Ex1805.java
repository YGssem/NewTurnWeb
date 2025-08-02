package module16_to_18;

// (Ex1805) 2차원 배열의 총합, 평균, 최대 값, 최소 값 출력
// ※ 1차원 배열에서 최대 값과 최소 값을 구하는 방식을 정확히 숙지하신 후에 이 예제를 봐주세요.

public class Ex1805 {
	public static void main(String[] args) {
		int[][] arr = { {10,20,30}, {40,50,60}, {70,80,90} };
		
		int sum=0, max=arr[0][0], min=arr[0][0];
		for(int i=0; i<=2; i++) { // i : 행 인덱스 (0~2)
			for(int j=0; j<=2; j++) { // j : 열 인덱스 (0~2)
//					→ 순서대로 분석: (i,j) : (0,0) → (0,1) → (0,2)
//										   → (1,0) → (1,1) → (1,2)
//										   → (2,0) → (2,1) → (2,2)
				sum += arr[i][j];
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
				if(min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("1) 총합 = " + sum);
		System.out.println("2) 평균 = " + (sum/9.0));
		System.out.println("3) 최대 값 = " + max);
		System.out.println("4) 최소 값 = " + min);
	}
}
