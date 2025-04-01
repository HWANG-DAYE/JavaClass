package project0401;

public class Cal_avg {

	int maxArray(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] items : arr) {
			for (int item : items) {
				if (max < item)
					max = item;
			}
		}
		return max;
	}

	int minArray(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for (int[] items : arr) {
			for (int item : items) {
				if (min > item)
					min = item;
			}
		}
		return min;
	}

	void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int z = 0; z < arr.length; z++) {
				System.out.println("arr[" + i + "][" + z + "]=" + arr[i][z]);
			}
			System.out.println();
		}
	}

	int sum_Array(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr[i].length; i++) {
			for (int z = 0; z < arr[i].length; z++) {

			}
		}
		return sum;
	}

	int cnt_Array(int[][] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt = cnt + arr[i].length;
		}
		return cnt;

	}
	
	
}
