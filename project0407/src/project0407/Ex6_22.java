package project0407;

public class Ex6_22 {
	static boolean isNumber(String str) {
		if(str == null || "".equals(str)) {
			return false;
		}
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!(c>='0' && c<='9')) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " +isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " +isNumber(str));
		
	}
}
