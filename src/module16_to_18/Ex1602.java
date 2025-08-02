package module16_to_18;

// (Ex1602) (간편법)

public class Ex1602 {
	public static void main(String[] args) {
		int[] scores = {70, 90, 85}; // 배열의 생성 (간편법)
		int total = 0; // 총합을 저장할 변수. 여기에 모두 더한 후 3으로 나눌 것.
		for(int i=0; i<=2; i++) {
			total += scores[i]; // 배열의 모든 요소들을 total에 더함.
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total/3);
	}
}
