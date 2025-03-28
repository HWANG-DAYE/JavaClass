package project0326;

public class String01 {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		
		if(str1==str2) {
			System.out.println("str1과 str2는 같은 객체를 참조");
		}
		else {
			System.out.println("str1과 str2는 다른 객체를 참조");
		}
		
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		if(str3==str4) {
			System.out.println("str3과 str4는 같은 객체를 참조");
		}
		else {
			System.out.println("str3과 str4는 다른 객체를 참조");
		}
		if (str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 문자열 입니다.");
		}
	}
}
