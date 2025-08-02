package module01_to_07;

// (Ex0302) 변수는 그 표현범위 외의 값을 절대로 담을 수 없음.

public class Ex0302 {
	public static void main(String[] args) {
		byte b3 = 126;
		b3++; 	// → ++는 변수의 값을 1 증가시킴. (참고만) 126에서 127이 됨.
		System.out.println(b3); // 127
		b3++; 	// → 127에서 128이 됨? 그럴까?
		System.out.println(b3); // [고급] 128이 출력될까?
	}
}
