package project0414;

public class SystemTimeEx {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum = sum + i;
		}
		long time2 = System.nanoTime();
		System.out.println("1부터 1000000만까지의 합 : " + sum);
		System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
	}
}
