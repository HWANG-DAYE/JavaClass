package EX;

import java.util.Scanner;

public class ForEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int b = sc.nextInt();

		if (a > b) {
			for (int i = b; i <= a; i++) {
				System.out.printf("%2d", i);
			}
		} else {
			for (int i = a; i <= b; i++) {
				System.out.printf("%2d", i);
			}
		}
	}
}
