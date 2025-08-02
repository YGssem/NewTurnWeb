package module19_to_23;

// (Ex2105.java) 재귀호출 : 피보나치 수열 (1 1 2 3 5 8 …)

public class Ex2105 {
	static int fibo(int n) { // n : 항 번호. 1이면 첫 번째 항, 2이면 두 번째 항
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
}
