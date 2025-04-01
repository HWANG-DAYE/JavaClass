package project0401;

public class Cal_avgEx {
	public static void main(String[] args) {
		Cal_avg cal = new Cal_avg();
		int[][] mathScores = new int[2][3];

		mathScores = new int[][] { { 90, 80 }, { 95, 97 }, { 85, 90 } };

		System.out.println("sum : " + cal.sum_Array(mathScores));
		System.out.println("avg : " + cal.sum_Array(mathScores) / (double) cal.cnt_Array(mathScores));
		System.out.println("--------------------------");
		cal.printArray(mathScores);
	}
}

