package project0320;

import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("전화번호 : ");
		String number = sc.next();
		
		System.out.println(name + " | " + age + " | " + number);
	}
}
