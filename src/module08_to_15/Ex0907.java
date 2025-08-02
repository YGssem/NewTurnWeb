package module08_to_15;

// (Ex0907) while문과 do~while문

public class Ex0907 {
	public static void main(String[] args) {
		// 1 2 3 4 (for문 복습)
		int i;
		for(i=1; i<=4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i : " + i); // i : 5 (이해) → 왜 4가 아니고 5일까?
		
		// 1 2 3 4 (while문)
		i=1;
		while(i<=4) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		// 1 2 3 4 (do~while문)
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i<=4);
	}
}
