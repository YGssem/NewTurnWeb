// (Ex3704.java) 클래스가 인터페이스를 다중구현하는 것은 허용함. [이해]
package module37;

interface In1 {
	void m();
}
interface In2 {
	void m();
}
class MyImpl implements In1, In2 { // 인터페이스의 '다중구현'은 허용됨! [이해]
	@Override
	public void m() {
		System.out.println("the m.");
	}
}
public class Ex3704 {
	public static void main(String[] args) {
		MyImpl obj = new MyImpl();
		obj.m();
	}
}
