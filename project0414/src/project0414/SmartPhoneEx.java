package project0414;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone mp = new SmartPhone("삼성", "안드로이드");
		
		String strObj = mp.toString();
		System.out.println(strObj);
		
		System.out.println(mp);
	}
}
