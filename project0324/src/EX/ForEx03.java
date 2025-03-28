package EX;

import java.util.Scanner;

public class ForEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б : ");
		int dan = sc.nextInt();
		
//		System.out.println(dan + "x" + 1 + "=" + (dan*1));
//		System.out.println(dan + "x" + 2 + "=" + (dan*2));
//		System.out.println(dan + "x" + 3 + "=" + (dan*3));
//		System.out.println(dan + "x" + 4 + "=" + (dan*4));
//		System.out.println(dan + "x" + 5 + "=" + (dan*5));
//		System.out.println(dan + "x" + 6 + "=" + (dan*6));
//		System.out.println(dan + "x" + 7 + "=" + (dan*7));
//		System.out.println(dan + "x" + 8 + "=" + (dan*8));
//		System.out.println(dan + "x" + 9 + "=" + (dan*9));
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
	}
	
}
