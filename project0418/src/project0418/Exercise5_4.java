package project0418;

public class Exercise5_4 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, 
						{ 10, 10, 10, 10, 10 }, 
						{ 20, 20, 20, 20, 20 }, 
						{ 30, 30, 30, 30, 30 } 
					  };
		int total = 0;
		float average = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=0; i<arr.length; i++) {
			cnt1 = cnt1 + arr[i].length;
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				cnt2++;
			}
		}

		System.out.println("total=" + total);
		average = total / (float)cnt1;
		System.out.println("average=" + average);
		average = total / (float)cnt2;
		System.out.println("average=" + average);
	} // end of main
} // end of class
