package project0327;

public class Array03_Random {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
//		arr[0] = (int)(Math.random()*6)+1;
//		System.out.println("arr["+0+"] : " + arr[0]);
//		sum = sum + arr[0];
//		
//		arr[1] = (int)(Math.random()*6)+1;
//		System.out.println("arr["+1+"] : " + arr[1]);
//		sum = sum + arr[1];
//		
//		arr[2] = (int)(Math.random()*6)+1;
//		System.out.println("arr["+2+"] : " + arr[2]);
//		sum = sum + arr[2];
//		
//		arr[3] = (int)(Math.random()*6)+1;
//		System.out.println("arr["+3+"] : " + arr[3]);
//		sum = sum + arr[3];
//		
//		arr[4] = (int)(Math.random()*6)+1;
//		System.out.println("arr["+4+"] : " + arr[4]);
//		sum = sum + arr[4];
//		
		
		// 위에 내용 for문 이용
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*6)+1;
			System.out.println("arr["+i+"] : " + arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("총합 : " + sum);
	}
}
