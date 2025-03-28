package project0320;

import java.math.BigDecimal;

public class BigDecimalEx01 {
	public static void main(String[] args) {
		// 기본타입
		// 타입 변수이름 = 값;
		
		// 참조타입
		// 타입 변수이름 = new 타입("값");
		// ctrl + shift + o
		BigDecimal a = new BigDecimal("0.1"); // double i = 0.1; 
		BigDecimal b = new BigDecimal("0.7"); // double i = 0.7; 
		
		// a + b
		System.out.println(a.add(b));
		// a - b
		System.out.println(a.subtract(b));
		// a * b
		System.out.println(a.multiply(b));
	}
}
