package project0415;

public class WrapperEx {
	public static void main(String[] args) {
		// 기본 타입 리턴
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		// 포장 객체 리턴
		Integer v1 = Integer.valueOf("10");
		Double v2 = Double.valueOf("3.14");
		Boolean v3 = Boolean.valueOf("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		System.out.println("------------------");
		
		System.out.println("value1: " + v1);
		System.out.println("value2: " + v2);
		System.out.println("value3: " + v3);
	}
}
