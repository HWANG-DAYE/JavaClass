package project0321;

import java.util.Scanner;

public class SwitchExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >");
		int age = sc.nextInt();
		
		int a = 0;
		
		switch(age/10) {
		case 0 :
			System.out.println("유소년");
			break;
		case 1 :
			System.out.println("청소년");
			break;
		case 2 : case 3 :
			System.out.println("청년");
			break;
		default :
			System.out.println("성공백세");
		}
	}
}
