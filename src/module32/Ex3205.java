package module32;

// (Ex3205) 다운캐스팅(Downcasting)은 명시적 형 변환이 필요.

class AA {
	int num;

	void showNum() {
		System.out.println("num : " + num);
	}
}

class BB extends AA {
	int num2;

	void showNum2() {
		System.out.println("num2 : " + num2);
	}
}

public class Ex3205 {
	public static void main(String[] args) {
		AA bb = new BB(); // 다형성 : "父-子" 로 기억. (부-자)
		// BB bb2 = new AA(); // ERR. // "子-父 는 안 됨." (자-부는 안 됨)
		
		bb.num = 100;
		// bb.num2 = 200; // ERR.
		bb.showNum();
		//bb.showNum2(); // ERR.
		
		((BB) bb).num2 = 10; // 형변환(downcasting)이 없으면 ERR. (이해)
		((BB) bb).showNum2(); // 형변환(downcasting)이 없으면 ERR. (이해)
	}
}
