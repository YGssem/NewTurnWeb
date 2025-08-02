package module19_to_23;

// (Ex1910) "값을 리턴한다" means "'메서드 호출 표현'을 그 값으로 바꾼다"

public class Ex1910 {
	static int ret10() {
		return 10;
	}
	public static void main(String[] args) {
		int num = ret10() + ret10(); // 이해 : 10 + 10 ;
		int num2 = ret10() * ret10() * ret10(); // 이해 : 10 ＊ 10 ＊ 10 ;
		System.out.println(num + "," + num2);
	}
}
