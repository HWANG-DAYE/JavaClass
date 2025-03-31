package project0331;

import java.util.Arrays;
import java.util.Scanner;

public class MainEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		
		System.out.printf("%d + %d = %d\n", x, y, (x+y));
		System.out.printf("%d - %d = %d\n", x, y, (x-y));
		System.out.printf("%d * %d = %d\n", x, y, (x*y));
		System.out.printf("%d / %d = %d\n", x, y, (x/y));
	}
}
