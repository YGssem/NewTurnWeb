package module08_to_15;

// (Ex1002) 누적곱 : 1부터 4까지의 곱

public class Ex1002 {
	public static void main(String[] args) {
		int mul = 1;
		for(int i=1; i<=4; i++) {
			mul *= i; // 또는 "mul = mul * i;"
		}
		System.out.println(mul);
	}
}
