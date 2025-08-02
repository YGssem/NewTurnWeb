package module08_to_15;

// (Ex0904) 1부터 100까지의 정수 중에서 2의 배수와 3의 배수를 출력

public class Ex0904 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
			}
		}
	}
}
