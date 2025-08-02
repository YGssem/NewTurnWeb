package module01_to_07;

// (Ex0705) 삼항연산자 (1)

public class Ex0705 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int max = a>b ? a : b;
		System.out.println("최대 값 : " + max);
		int min = b<a ? b : a;
		System.out.println("최소 값 : " + min);
	}
}
