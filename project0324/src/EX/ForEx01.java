package EX;

import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = sc.nextInt();
		
		int res = 0;
		for(int i=1; i<=n; i++) {
			res = res+i;
		}
		System.out.println(res);
	}
}
