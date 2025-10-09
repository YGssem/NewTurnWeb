// (Ex3703.java) [참고] 클래스의 다중상속은 금지.
package module37;

class A1 {
	void m1() {
		System.out.println(1);
	}
}
class A2 {
	void m1() {
		System.out.println(2);
	}
}

//class B extends A1, A2 { → ERR. 클래스의 다중상속은 금지됨. [이해]
//}

public class Ex3703 {
	public static void main(String[] args) {
	}
}
