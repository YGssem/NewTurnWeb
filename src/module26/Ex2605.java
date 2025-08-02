package module26;

// (Ex2605) this()의 이해.

class Person {
	String name;
	int age;
	String gender;
	
	public Person(String name) {
		this(name, 0);
	}
	
	public Person(String name, int age) {
		this(name, age, "모름");
	}
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
	
public class Ex2605 {
	public static void main(String[] args) {
		Person p1 = new Person("AI");
		Person p2 = new Person("KG", 24);
		Person p3 = new Person("YG", 19, "남자");
		System.out.println(p1.name + " (" + p1.age + ", " + p1.gender + ")");
		System.out.println(p2.name + " (" + p2.age + ", " + p2.gender + ")");
		System.out.println(p3.name + " (" + p3.age + ", " + p3.gender + ")");
	}
}
