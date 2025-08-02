package module30;

// (Ex3001) @Override 애노테이션

class A2 {
	int a;
	void show() {
		System.out.println("a : " + a);
	}
}

class B2 extends A2 {
	int b;
	@Override // '애노테이션(annotation)'
	// → 아랫줄에서 정의하는 메서드는 "(부모클래스의 메서드를) 메서드 오버라이딩 하는 메서드"
	//   라는 표시. 즉, "부모클래스로부터 상속받은 show() 메서드가 있지만, 나는 show() 메서드
	//   를 재정의해서 쓰겠다" 라는 의미 (이해)
	void show() {
		System.out.println("a : " + a + ", b : " + b);
	}
	void show(int c) { // → "메서드 오버로딩" : 파.개.타.
		// → 이 메서드는 (메서드 오버라이딩이 아니고) 메서드 오버로딩임. 메서드 오버라이딩이려면,
		//   파라미터 구성도 동일해야 하는데, 이 메서드의 파라미터 구성이 부모클래스의 것과 다르므
		//   로, 메서드 오버라이딩이 아님. (이해)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class Ex3001 {
	public static void main(String[] args) {
		B2 obj = new B2();
		obj.show(); // 이해 : (3행의 show()가 아니라) 12행의 show()가 실행됨. 메서드 
					//		 오버라이딩 하였으므로.
	}
}
