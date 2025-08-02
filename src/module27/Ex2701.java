package module27;

import java.util.ArrayList;

// (Ex2701) ArrayList의 기본적인 메서드 사용.

public class Ex2701 {
	public static void main(String[] args) {
		ArrayList<Integer> list1;
		// → Integer객체의 참조값들을 관리하는 ArrayList.
		list1 = new ArrayList<Integer>();
		
		// 1) 요소의 추가 : .add()
		list1.add(5);  // → [5]
		list1.add(7);  // → [5, 7]
		list1.add(2);  // → [5, 7, 2]
		list1.add(10); // → [5, 7, 2, 10]
				
		// 2) 리스트 출력 : .size() / .get() 를 사용해서.
		System.out.println(list1);
		for(int i=0; i<=list1.size()-1; i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		// 3) 요소 삭제 : .remove(인덱스)
		list1.remove(1); // 인덱스=1 인 요소를 삭제함.
		System.out.println(list1); // [5, 2, 10] → 이해
		
		// 4) 특정 요소의 포함 여부 : ①.contains(값) ②.indexOf(값)
		System.out.println(list1.contains(5)); // true → 5가 있음
		System.out.println(list1.contains(10)); // true → 10이 있음
		System.out.println(list1.contains(15)); // false → 15는 없음
		
		System.out.println(list1.indexOf(5)); // 0 → 그 자리에 5가 있음
		System.out.println(list1.indexOf(10)); // 2 → 그 자리에 10이 있음
		System.out.println(list1.indexOf(15)); // -1 → 15는 없음
	}
}
