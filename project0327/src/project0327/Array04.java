package project0327;

public class Array04 {
	public static void main(String[] args) {
		int sum = 0;
		int[] scores;
		scores = new int[] { 83,90,97 };
		
		int[] scores2 = { 100,90,95 };
		
		int[] scores3 = new int[3];
		
		sum = sum + scores[0];
		sum = sum + scores[1];
		sum = sum + scores[2];
		System.out.println(sum);
		
		sum=0;
		for(int i=0; i<scores2.length; i++) {
			sum = sum + scores2[i];
		}
		System.out.println(sum);
		
		sum=0;
		for(int i=0; i<scores3.length; i++) {
			sum = sum + scores3[i];
		}
		System.out.println(sum);
	}
}
