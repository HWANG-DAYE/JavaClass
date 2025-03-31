package project0331;

public class Question {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				if(max<array[i][j]) max = array[i][j];
				if(min>array[i][j]) min = array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
