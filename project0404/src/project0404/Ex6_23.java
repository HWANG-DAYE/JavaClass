package project0404;

public class Ex6_23 {
	public static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		int max = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) 
				max = arr[i];
		}
		return max;
	}
	
	public static int min(int[] arr) {
		if(arr==null || arr.length == 0) 
			return -999999;
		int minValue = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[]{}));
	}
}
