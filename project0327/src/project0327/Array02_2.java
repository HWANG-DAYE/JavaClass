package project0327;

public class Array02_2 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		System.out.println(scores.length);
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] : %d\n", scores[i]);
		}
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"] : " + scores[i]);
		}
		
		System.out.println("-------------------------");
		
	}
}
