package module19_to_23;

// (Ex2104) [고급] 재귀호출 : palindrome

public class Ex2104 {
	static boolean palindrome(String s) {
		if(s.length()<=1)
			return true;
		if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		return palindrome(s.substring(1,s.length()-1));
	}
	public static void main(String[] args) {
		System.out.println("noon : " + palindrome("noon"));
		System.out.println("madam : " + palindrome("madam"));
		System.out.println("racecar : " + palindrome("racecar"));
		System.out.println("door : " + palindrome("door"));
		System.out.println("car : " + palindrome("car"));
	}
}
