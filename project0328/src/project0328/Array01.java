package project0328;

public class Array01 {
	public static void main(String[] args) {
//	int[] arr = { 1, 2, 3 };
//	
//	int[] arr2;
//	arr2 = new int[] { 1, 3, 5 };
//	
//	int [] arr3 = new int[5];
//	--------------------------------------------------------------

		/**
		 * 길이가 5인 배열을 선언 1~6 사이의 랜덤한 값으로 초기화 값을 출력 합, 평균, 최대, 최소 구한 후 출력
		 */
		int sum = 0;
		double avg = 0.0;
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
			System.out.println("arr[" + i + "] : " + arr[i]);
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
			sum = sum + arr[i];
		}
		
		avg = sum / (arr.length*1.0);
		System.out.println("------------------------------------");
//		System.out.println("합 : " + sum);
//		System.out.println("평균 : " + (sum/(arr.length*1.0)));
//		System.out.println("최대 : " + max);
//		System.out.println("최소 : " + min);
		
		System.out.printf("\n합: %d, 평균 : %.1f, 최대 : %d, 최소 : %d", sum, avg, max, min);
	}

}
