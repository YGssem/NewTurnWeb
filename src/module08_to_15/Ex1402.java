package module08_to_15;

import java.util.Random;

// (Ex1402) 씨드(Seed) 값 설정.

public class Ex1402 {
	public static void main(String[] args) {
		Random rd = new Random(); // Random 객체 생성문.
		rd.setSeed(1000); // 씨드값을 1000으로 설정.
		//	→ '씨드값'이란, 난수발생 연산시 기준이 되는 값으로서, 6행에서와 같이 이 값을 일정
		//	   한 값으로 고정시키면 난수발생 순서가 항상 동일하게 됨.
		for(int i=1; i<=10; i++) {
			int r = rd.nextInt(6) + 1;
			// → rd.nextInt(6) 에서, 0 이상 5 이하의 정수가 만들어짐.
			System.out.print(r + " ");
		}
	}
}