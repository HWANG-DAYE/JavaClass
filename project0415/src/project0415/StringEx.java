package project0415;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		String str = sc.nextLine();
//		System.out.println(str);
//		System.out.println(str.length());
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		for(String item : arr) {
			for(int i=item.length()-1; i>=0; i--) {
				System.out.print(item.charAt(i));
			}
			System.out.print(" ");
		}
		
	}
}