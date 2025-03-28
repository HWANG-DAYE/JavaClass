package project0320;

public class InfinityAndNaNCheckExaple {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y; // 무한대
//		double z = x % y; // Nan
		System.out.println(z);
		
//		Infinity 또는  Nan 값이면 true 리턴, 그렇지 않으면 false리턴
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
	}
}
