package module34;

class A {
}

public class Ex3401 {
	public static void main(String[] args) {
		A obj = new A();
		String s = obj.toString(); // → 이해 : "toString()을 정의한 적이 없는데, 왜 에러가 아닐까!?"
	}
}
