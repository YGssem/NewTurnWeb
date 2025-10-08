package module35;

class A3 { 				// → 접근제어자가 없는 게 아니라, default 접근제어자가 적용된 것.
	public int num; 	// public : 접근허용의 범위를 제한하지 않음.
	private int num2; 	// private : 접근허용의 범위를 "클래스 내"로 한정함.
	int num3; 			// → 접근제어자가 없는 게 아니라, default 접근제어자가 적용된 것.
	public void m() { }
	private void m2() { }
}
public class Ex3501 {
	public static void main(String[] args) {
		A3 obj3 = new A3();
		
		obj3.num = 10; 	// → public으로 지정된 것에는 접근O
		// obj3.num2 = 20; // ERR. private으로 지정된 것에는 접근X
		obj3.num3 = 30; // → default로 지정된 것에는 접근O
		obj3.m(); 		// → public으로 지정된 것에는 접근O
		// obj3.m2(); 	// ERR. private으로 지정된 것에는 접근X
	}
}
