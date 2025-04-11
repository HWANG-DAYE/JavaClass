package project0411;

public class NullPointerExceptionEx {
	public static void printLength(String data) {
		try {
			int res = data.length();
			System.out.println("문자수 : " + res);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("이것이 자바다");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
