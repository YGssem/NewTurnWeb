// (Ex3502.java) 부모클래스의 private한 멤버에 접근이 가능할까.
package module35;

class A4 {
	private int num;
}
class B4 extends A4 {
	void showNum() {
		// System.out.println(num); // ERR [이해]
	}
}
public class Ex3502 {
	public static void main(String[] args) {
	}
}
