package project0401;

public class Calculator2Ex {
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		c.powerOn();
		System.out.println("result1 : " + c.plus(5, 6));
		System.out.println("result2 : " + c.divide(10, 4));
		c.powerOff();
	}
}
