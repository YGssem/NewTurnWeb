package module31;

// (Ex3102) 자식클래스 생성자의 첫째줄에서는 (반드시) 부모클래스의 생성자를 호출해야 한다!

class AA {
	int num;
	AA(int num) {
		this.num = num;
	}
}
class BB extends AA {
	double num2;
	BB(int num, double num2) {
		super(num);  // → 자.생.첫.부.생.호 ! (이해)
		this.num2 = num2;
	}
}
public class Ex3102 {
	public static void main(String[] args) {
		BB obj = new BB(5, 10.0);
		System.out.println(obj.num + ", " + obj.num2);
	}
}