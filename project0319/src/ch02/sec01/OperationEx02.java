package ch02.sec01;

public class OperationEx02 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = x/y; // 1/2 = 0.5?
		System.out.println(z); // 0
		
		double d = (double)(x/y);
		System.out.println(d); // 0.0
		
		// 소수점까지 연산이 되기 위해서는 피연산자 중
		// 하나라도 실수타입이 있어야 소수까지 연산이 된다.
		d = (double)x / y;
		System.out.println(d);
		
		d = x / (double)y;
		System.out.println(d);
		
		d = (double)x / (double)y;
		System.out.println(d);
	}
}
