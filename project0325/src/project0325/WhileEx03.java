package project0325;

import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int n = sc.nextInt();
		int res = 0;
		
		// while문
		while(n>0) {
			n = n/10;
//			System.out.println(n);
			res++;
		}
		System.out.println("자리수는 : " + res);
		
		// for문
//		int jari = 0;
//		for(jari)
	}
}
