package module01_to_07;

// (Ex0401) 강제 형 변환.

public class Ex0401 {
	public static void main(String[] args) {
		double d = 3.0;
		int num = (int)d * 3; // (int)d → 강제 형 변환 결과 3이 됨.
			// → d가 double 타입이므로 d*3은 double 타입임. 이 값을 int에 저장해야 하므로
			//   double에서 int로의 형 변환을 해야 하는데, 이건 '자동 형 변환 규칙'에 위배되므
			//   로, '자동 형 변환'이 되지는 않음. 따라서, 이 문장에서는 우리가 직접 형 변환을
			//   해줘야 하는데, 이를 '강제 형 변환'이라 함.
		System.out.println("num : " + num);
		
		int num2 = 10;
		System.out.println("num,num2 : " + num + "," + num2);
		System.out.println("num,num2 : " + num + num2); // (참고)
	}
}
