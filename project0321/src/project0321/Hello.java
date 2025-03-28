package project0321;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		System.out.println("일의 자리는 : " + ( n%10 ));
		
		String str = n%2==0 ? "짝수" : "홀수";
		
		Math.abs(-2);
		int n2 = n<0 ? -n : n;
		System.out.println(str);
		System.out.println("절댓값은 : " + n2);
	}

}
