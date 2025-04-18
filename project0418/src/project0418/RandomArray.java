package project0418;

import java.util.Arrays;

public class RandomArray {
	public static void main(String[] args) {
		int[] arr = random();
		System.out.println(Arrays.toString(arr));
		int[] arr2 = random2();
		System.out.println(Arrays.toString(arr2));
	}
	
	public static int[] random() {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*5)+1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
	
	public static int[] random2() {
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			int index = (int)(Math.random()*5);
			int tmp = arr[index];
			arr[index] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}
}
