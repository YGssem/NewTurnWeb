package module32;

// (Ex3203) (복습) 변수는 다형성이 적용되지 않음. "Variable Hiding" (모듈30).

class Americano {
	int price = 2000;
}

class IcedAmericano extends Americano {
	int price = 2500;
}

public class Ex3203 {
	public static void main(String args[]) {
		Americano a = new IcedAmericano();
		System.out.println("price : " + a.price); // 2000
	}
}
