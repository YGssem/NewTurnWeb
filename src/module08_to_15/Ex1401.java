package module08_to_15;

// (Ex1401) 1부터 6까지의 정수 난수발생, 10개 출력

public class Ex1401 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			int r = (int)(Math.random() * 6) + 1; // 이해.
				// → 1부터 6까지의 정수 중 하나를 고르기 위해,
				//   0부터 5까지의 정수 중 하나를 골라야하고, 그러기 위해서는,
				//   0.0부터 5.9999999…까지의 실수 중 하나를 고르도록 해야함.
				//   순서를 반대로해서 다시 한번 생각해보면,
				//   Math.random() : 0.0부터 0.9999999999…까지의 실수 중 하나
				//   Math.random()＊6 : 0.0부터 5.99999999…까지의 실수 중 하나
				//   (int)(Math.random()＊6) : 0부터 5까지의 정수 중 하나
				//   (int)(Math.random()＊6)+1 : 1부터 6까지의 정수 중 하나
			System.out.print(r + " ");
			}
	}
}
