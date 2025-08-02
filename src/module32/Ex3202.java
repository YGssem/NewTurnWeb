package module32;

// (Ex3202) 다형성, "업캐스팅(Upcasting)"

class Shape {
	void draw() {
		System.out.println("그림");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("원을 그림");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("삼각형을 그림");
	}
}

class Star extends Shape {
	void draw() {
		System.out.println("별을 그림");
	}
}

public class Ex3202 {
	public static void main(String args[]) {
		Shape shape;
		shape = new Circle(); // 업캐스팅
		shape.draw();
		shape = new Triangle(); // 업캐스팅
		shape.draw();
		shape = new Star(); // 업캐스팅
		shape.draw();
	}
}