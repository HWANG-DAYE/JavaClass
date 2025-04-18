package project0418;

public class ArrayEx {
	public static void main(String[] args) {
		ArrayCalculator cal = new ArrayCalculator();
		int[] arr = cal.random(new int[] {1,2,3,4,5});
		int sum = cal.sum(arr);
		double avg = cal.avg(arr);
		int max = cal.max(arr);
		int min = cal.min(arr);
		cal.display(arr);
		System.out.println("sum : " +sum);
		System.out.println("avg : " +avg);
		System.out.println("max : " +max);
		System.out.println("min : " +min);
	}
}
