package project0327;

public class Array05_Random {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*6)+1;
			System.out.println("arr["+i+"] " + arr[i]);
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
		System.out.println("�ִ� : " + max);
		System.out.println("�ּ� : " + min);

	}
}