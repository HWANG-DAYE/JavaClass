/**
 * sum 합 구하기
 * 평균(합/배열의 길이) -> 소수점까지 출력
 */
package project0327;

public class Array06_Random {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 6) + 1;
			System.out.println("arr[" + i + "] " + arr[i]);
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
			sum = sum + arr[i];
		}
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (sum/(arr.length*1.0)));
	}
}
