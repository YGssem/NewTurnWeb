package module16_to_18;

import java.util.Arrays;

// (Ex1708) 주사위를 두 번 던져, 중복 없는 두 수를 만들어 출력 / boolean 타입의 배열 사용

public class Ex1708 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[6]; // 배열의 모든 요소가 false로 "자동초기화"
		
		for(int i=1; i<=2; i++) { // 두 번 반복.
			int idx = (int)(Math.random() * 6); // 난수발생 : 0 ~ 5
			// 중복체크.
			if(arr[idx]) { // 중복이라면, i를 1감소 하고 for문으로 올려보냄. (이해)
				i--;
				continue;
			}
			arr[idx] = true;
			// → 배열 arr의 이 요소를 true로 놓음으로써,
			//   이번에 던진 주사위의 값이 "idx+1" 임을 표시해둠.
			//   예를 들어, arr[0] = true; 를 실행하고 있는 거라면,
			//   주사위를 던진 결과 1이 나왔다는 것.
		}
		System.out.println(Arrays.toString(arr)); // true가 2개임을 확인.
		
		// "__,__"의 형식으로 출력.
		int cnt = 0;  // → comma를 하나만 찍기 위해서 선언한 변수.
		System.out.print("(");
		for(int i=0; i<=5; i++) {
			if(arr[i]) {
				System.out.print( i+1 ); // i+1 : 주사위로 뽑은 숫자 (이해).
				cnt++;
				if(cnt==1) {
					System.out.print(",");
				}
			}
		}
		System.out.println(")");
	}
}
