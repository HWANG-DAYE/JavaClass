package EX;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ют╥б : ");
//		int n = sc.nextInt();
		int n = 5;
		
		int multi = 1;
		for(int i=1; i<=n; i++) {
			multi = multi * i;
		}
		System.out.println(multi);
	}
}
