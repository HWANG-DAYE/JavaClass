package EX;

import java.util.Scanner;

public class PrintEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		int num1 = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d + %d + %d\n", num1, num2, (num1+num2));
		System.out.printf("%d - %d + %d\n", num1, num2, (num1-num2));
		System.out.printf("%d * %d + %d\n", num1, num2, (num1*num2));
		System.out.printf("%d / %d + %d\n", num1, num2, (num1/num2));
		System.out.printf("%d / %d + %.1f\n", num1, num2, (num1*1.0/num2));
	
	}
}
