package module08_to_15;

// (Ex1104) continue문

public class Ex1104 {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			if(i==4) {
				continue; // 이해 : "다음 반복회차부터 계속"
			}
			System.out.print(i + " ");
		}
	}
}
