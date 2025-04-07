// Arrays.toSting (배열이름)

package project0407;

import java.util.Arrays;
import java.util.Scanner;

public class CharAt {
	public static char[] toCharArray(String str) {
		char[] arr = new char[str.length()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		char[] arr = toCharArray(str);
		System.out.println(Arrays.toString(arr));
	}
}
