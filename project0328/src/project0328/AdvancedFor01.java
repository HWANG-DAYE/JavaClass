package project0328;

public class AdvancedFor01 {
	public static void main(String[] args) {
		int[] scores = { 95,71,84,93,97 };
		
		int sum = 0;
		for(int score : scores) {
			sum = sum +score;
		}
		System.out.println("���� ���� = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);
	}
}
