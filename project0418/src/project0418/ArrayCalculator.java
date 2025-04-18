package project0418;

public class ArrayCalculator {
	public int[] random(int[] arr) {
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
	
	public int[] random2(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int index = (int)(Math.random()*5);
			int tmp = arr[index];
			arr[index] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}
	
	// 배열의 합
	public int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	// 배열의 평균
	public double avg(int[] arr) {
		return sum(arr) / (double)arr.length;
	}
	// 배열의 최대
	public int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int item : arr) {
			if(max < item) {
				max = item;
			}
		}
		return max;
	}
	// 배열의 최소
	public int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int item:arr) {
			if(min > item) {
				min = item;
			}
		}
		return min;
	}
	// 배열을 출력
	public void display(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
	
}