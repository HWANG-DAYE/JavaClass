package project0321;

import java.util.Scanner;

public class ForSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
//		for(int i=1; i<=5; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		for(int i=1; i<=n; i++) {
			sum = sum+i; // sum+=i;
		}
		System.out.println(sum);
	}
}
