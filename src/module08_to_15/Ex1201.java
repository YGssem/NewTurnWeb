package module08_to_15;

// (Ex1201) 소수 판단 by ‘방법1’.

public class Ex1201 {
	public static void main(String[] args) {
		int num = 7;  // → 소수인지 여부를 판별하고자 하는 수를 변수 num에 담았음.
		int cnt = 0; // 나누어 떨어지는 경우가 몇 번인지를 카운트하기 위한 변수.
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++; // 카운트 1 증가.
			}
		}
		if(cnt==2) { // 나누어 떨어지는 경우가 딱 2번이면, num은 소수임.
			System.out.println(num + "은(는) 소수임.");
		} else { // 그 외의 모든 경우, num은 소수가 아님.
			System.out.println(num + "은(는) 소수가 아님.");
		}	
	}
}
