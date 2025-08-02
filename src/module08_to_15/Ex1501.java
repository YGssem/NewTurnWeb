package module08_to_15;

import java.util.Scanner;

// (Ex1501) 스캐너와 입력 버퍼

public class Ex1501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 : ");
		String str1 = sc.nextLine(); // 입력 가정 : "스캐너와 입력버퍼를" (엔터)
		System.out.print("2 : ");
		String str2 = sc.next(); 	// 입력 가정 : "공부하고 있습니다." (엔터)
		System.out.print("3 : ");
		String str3 = sc.next(); 	// 입력버퍼에 있던 "있습니다."을 가져옴.

		System.out.println("1 = " + str1);
		System.out.println("2 = " + str2);
		System.out.println("3 = " + str3);

		sc.close(); 	// → 쓰기를 권장함. (그런데, 안 써도 돼요)
	}
}