package project0411;

public class NullPointerExceptionEx2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
	}
}
