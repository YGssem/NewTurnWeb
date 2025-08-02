package module16_to_18;

import java.util.Arrays;

// (Ex1709) 로또번호 생성프로그램1 / boolean 타입의 배열(사이즈:45)을 사용하는 방식

public class Ex1709 {
	public static void main(String[] args) {
		boolean[] lotto = new boolean[45]; // 인덱스 0~44 → 의미: 로또번호 1~45
		// System.out.println(Arrays.toString(lotto)); → 배열의 초기 값 출력.
		// → 이 배열은 전부 false로 채워져 있음을 확인. (배열은 '자동초기화' 됩니다.)
		
		// 난수발생 (6개의 정수)
		for(int i=1; i<=6; i++) {  // → 여섯 번 반복.
			int idx = (int)(Math.random()*45);  // → 0 ~ 44
			if(lotto[idx]) { // → 인덱스 idx 자리가 이미 true 값인 경우 (=중복!)
				i--; 	// → 이 문장이 왜 필요할까요? (이해)
				continue;
			}
			lotto[idx] = true;
		}
		
		System.out.println(Arrays.toString(lotto));
		for(int i=0; i<=44; i++) {
			if(lotto[i]) {
				System.out.print((i+1) + " ");
			}
		}
	}
}
