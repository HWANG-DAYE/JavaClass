package project0326;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int n = sc.nextInt();
		int jari = 0;
		int sum = 0;
		while(n>0) {
			int tmp = n%10;
			n=n/10;
			System.out.println("n : " + n);
			jari++;
			sum = sum+tmp;
		}
		System.out.println(jari); // 자리수
		System.out.println(sum); //ex) 1+2+3+4
	}
	
}
