package project0415;

public class ValueCompareEx {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱 후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		// byte, short, int의 경우  -128~127 사이의 값일 경우 비교 가능
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱 후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
		System.out.println();
	}
}
