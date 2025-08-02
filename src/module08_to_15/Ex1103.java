package module08_to_15;

// (Ex1103) break문.

public class Ex1103 {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			if(i==5) {
				break; // 반복문을 탈출함!
			}
			System.out.print(i + " ");
		}
	}
}
