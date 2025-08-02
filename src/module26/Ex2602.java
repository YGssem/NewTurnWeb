package module26;

// (Ex2602) 객체의 참조값들을 저장하는 배열.

class ScoreData {
	String name; // 이름
	int java; // 자바 점수
	int c; // C 점수
	
	ScoreData(String name, int java, int c) {
		this.name = name;
		this.java = java;
		this.c = c;
	}
	
	void show() {
		System.out.println(name + " (Java:" + java + ", C:" + c + ")");
	}
}
public class Ex2602 {
	public static void main(String[] args) {
		ScoreData score1 = new ScoreData("YG", 99, 95); // Java 99점, C 95점
		
		ScoreData[] arr = new ScoreData[3];
		arr[0] = score1; // 이해
		arr[1] = new ScoreData("AI", 90, 100); // 이해
		arr[2] = new ScoreData("KG", 85, 85); // 이해
		
		for(int i=0; i<=arr.length-1; i++) {
			// 이해: arr[i] → "참조값" (ScoreData 객체의 참조값)
			arr[i].show(); // "(ScoreData 객체의 참조값).show()"
		}
	}
}
