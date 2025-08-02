package module08_to_15;

// (Ex0903) 1부터 100까지의 정수들 중에서 짝수만 출력.

public class Ex0903 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
}
