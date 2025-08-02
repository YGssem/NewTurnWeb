package module28;

// (Ex2803) (고급) 메서드 자기 자신이 속한 클래스의 객체를 생성할 수 있음.

public class Ex2803 {
	int num = 55; 	// 인스턴스변수
	static int totalNum = 0; // totalNum : 객체들의 개수.
	// → 이 변수를 모든 Ex2803 객체들이 공유할 수 있도록, 클래스변수로 선언함.
	
	Ex2803() {
		System.out.println("Ex2803 객체가 생성됨.");
		totalNum++;
	}

	public static void main(String[] args) { // main()은 클래스메서드임.
		// System.out.println(num); 	// ERR. (이해)
		
		Ex2803 obj = new Ex2803();
		System.out.println(obj.num); 	// 인스턴스변수는 "참조변수."으로 접근.
		
		if(Ex2803.totalNum++ < 2) {
			Ex2803.main(null); 			// 클래스메서드는 "클래스이름."으로 접근 가능.
			//obj.main(null); 			// (권장X)
		}
	}
}