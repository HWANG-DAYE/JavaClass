package project0326;

public class CalCulatorEx {
	public static void main(String[] args) {
		int x=1;
		int y=2;
		String str = "hello";
		String str2 = null;
		System.out.println(str2 == null);
		System.out.println("고정된문자열".equals(str2));//오류 발생x
		System.out.println(str2.equals("고정된문자열")); //오류 발생
	}
}
