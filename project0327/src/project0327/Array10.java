package project0327;

public class Array10 {
	public static void main(String[] args) {
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.print("javaScores["+i+"]["+k+"]=" +javaScores[i][k]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.print("mathScores["+i+"]["+k+"]=" + mathScores[i][k]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
		int[][] englishScores = new int[2][];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.print("mathScores["+i+"]["+k+"]=" + mathScores[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	
		
	}
}
