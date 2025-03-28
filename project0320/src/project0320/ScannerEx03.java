package project0320;

import java.util.Scanner;

public class ScannerEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int x = sc.nextInt();
		System.out.print("수를 입력하시오 : ");
		int y = sc.nextInt();
		
		System.out.println(x+"+"+y+"=" + (x+y));
		System.out.println(x+"-"+y+"=" + (x-y));
		System.out.println(x+"*"+y+"=" + (x*y));
		System.out.println(x+"/"+y+"=" + (x/y));
		System.out.println(x+"/"+y+"=" + ((double)x/y)); // 하나라도 더블로 바꿔야 소수점까지 나옴
	}
}
