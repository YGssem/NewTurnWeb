package module26;

// (Ex2604) 키워드 this의 사용.

class Point3 {
	int x;
	int y;
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Ex2604 {
	public static void main(String[] args) {
		Point3 p1 = new Point3(1,1);
		Point3 p2 = new Point3(5,4);
		
		System.out.println("점#1 : " + p1.x + "," + p1.y);
		System.out.println("점#2 : " + p2.x + "," + p2.y);
	}
}
