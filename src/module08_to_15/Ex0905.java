package module08_to_15;

// (Ex0905) 구구단 num단을 출력

public class Ex0905 {
	public static void main(String[] args) {
		int num = 5; // num : 구구단 몇 단을 출력할지를 담고 있는 변수.
		for(int i=1; i<=9; i++) {
			System.out.println(num + " x "+i+" = " + (num*i));
		}
	}
}
