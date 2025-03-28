package ch02.sec01;
public class FloatDoubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);

		//10의 거듭제곱 리터럴
		double var3 = 3e6; // 3x10^6
		float var4 = 3e6F; // 3x10^6
		double var5 = 2e-3; // 2x10^-3
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}
 }
