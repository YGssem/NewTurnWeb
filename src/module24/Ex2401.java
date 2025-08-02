package module24;

// (Ex2401) "참조변수" 와 "객체", 그리고 "클래스"

class Dog {
	// → 여기에, 이 클래스의 구성 요소를 정의함.
	//   이 클래스의 구성은, 변수 1개 + 메서드 1개.
	String name;
	void bark() {
		System.out.println(name + ": 멍멍!");
	}
}

public class Ex2401 {
	public static void main(String[] args) {
		Dog dog1; 	// Dog 객체를 가리킬 수 있는 변수 선언.
					// → dog1은 "참조변수".
		dog1 = new Dog(); // Dog 객체를 생성해서 변수 dog1과 연결.
					// → "new 클래스이름()" 이 실행되면, 객체가 생성됨.
		dog1.name = "장군이";
					// → 참조변수 dog1이 가리키는 객체 안에 있는 name 변수에 대입함.
		Dog dog2;
					// → dog2는 "참조변수".
		dog2 = new Dog();
					// → "new 클래스이름()" 이 실행되면, 객체가 생성됨.
		dog2.name = "맥스";
					// → 참조변수 dog2가 가리키는 객체 안에 있는 name 변수에 대입함.
		
		dog1.bark(); // dog1이 가리키는 객체의 bark() 메서드를 호출.
		dog2.bark(); // dog2가 가리키는 객체의 bark() 메서드를 호출.
	}
}
