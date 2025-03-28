package project0321;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num>=0) {
			System.out.println(num);
		} else if (num<0) {
			System.out.println(-num);
		}
	}
}
