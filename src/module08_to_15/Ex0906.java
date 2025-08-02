package module08_to_15;

// (Ex0906) (고급) 숫자삼각형 출력.

public class Ex0906 {
	public static void main(String[] args) {
		int n = 4; 		// n : 행의 수를 담고 있는 변수.
		int print = 1; 	// print : '이번에 출력할 숫자'를 담고 있는 변수.
		for(int i=1; i<=n; i++) { 		// n번 반복 (이해)
			for(int j=1; j<=i; j++) { 	// i번 반복 (이해)
				System.out.print(print + " ");
				print++;
			}
			System.out.println();
		}
	}
}
