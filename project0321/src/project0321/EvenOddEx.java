package project0321;

import java.util.Scanner;

public class EvenOddEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
//		int abs = n<0 ? -n : n;
//		System.out.println("절댓값은 : " + abs);
		
		if (n<0) {
			System.out.println("절댓값은 : " + -n);
		} else {
			System.out.println("절댓값은 : " + n);
		}
	}
}
