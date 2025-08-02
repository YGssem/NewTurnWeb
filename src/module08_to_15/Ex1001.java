package module08_to_15;

// (Ex1001) 누적합 : 1부터 5까지의 합

public class Ex1001 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=5; i++) {  // → 반복, i가 1부터 시작해서 5까지 1씩 증가
			sum += i;  // 또는, sum = sum + i;
		}
		System.out.println("1부터 5까지의 합 : " + sum);
	}
}
