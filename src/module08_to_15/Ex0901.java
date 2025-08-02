package module08_to_15;

// (Ex0901) for문.

public class Ex0901 {
	public static void main(String[] args) {
		// 1 2 3 4
		for(int i=1; i<=4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4 3 2
		for(int i=4; i>=2; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2 4 6 8 10
		for(int i=2; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
