package module19_to_23;

// (Ex1904) 파라미터 2개 이상도 가능

public class Ex1904 {
	// printStars(n, ch) : n회 반복해서 문자(ch)를 출력해주는 메서드
	static void printStars(int n, char ch) {
		for(int i=1; i<=n; i++) { // n회 반복
			System.out.print(ch);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		printStars(4, '*'); // ＊＊＊＊
		printStars(6, '*'); // ＊＊＊＊＊＊
	}
}
