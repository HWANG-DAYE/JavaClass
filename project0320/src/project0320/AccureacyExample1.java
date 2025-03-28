package project0320;

import java.math.BigDecimal;

public class AccureacyExample1 {
	public static void main(String[] args) {
//		int apple = 1;
		BigDecimal apple = new BigDecimal("1");
//		double pieceUnit = 0.1;
		BigDecimal pieceUnit = new BigDecimal("0.1");
//		int number = 7;
		BigDecimal number = new BigDecimal("7");
		
//		double result = apple - number * pieceUnit;
		BigDecimal temp = number.multiply(pieceUnit);
		BigDecimal result = apple.subtract(number.multiply(pieceUnit));
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면.");
		System.out.println(result + "조각이 남는다.");
	}

}
