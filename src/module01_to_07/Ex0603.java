package module01_to_07;

// (Ex0603) 산술+대입연산자

public class Ex0603 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		b = a;
		a += 1;  // → (a = a + 1;) 으로 해석함. 즉, a+1 (=4) 을 a에 저장(대입)함.
		a /= 2;  // → (a = a / 2;) 으로 해석함. 즉, a/2 (=2) 를 a에 저장(대입)함.
		a *= b;  // → (a = a * b;) 으로 해석함. 즉, a*b (=6) 를 a에 저장(대입)함.
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
