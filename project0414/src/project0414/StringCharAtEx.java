package project0414;

public class StringCharAtEx {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char s = ssn.charAt(7);
		switch (s) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
