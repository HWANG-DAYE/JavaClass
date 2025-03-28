package project0321;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("수를 입력 : ");
		int num2 = sc.nextInt();
		
		String str = num1 > num2? "더 큰 값 : "+num1 : num2>num1? "더 큰 값 : "+num2 :  "두 값이 같음";
		System.out.println(str);
		
		if (num1 < num2) {
			System.out.println("더 큰 값 : " + num2);
		} else if (num1 > num2) {
			System.out.println("더 큰 값 : " + num1);
		} else {
			System.out.println("두 값이 같음");
		}
	}
}