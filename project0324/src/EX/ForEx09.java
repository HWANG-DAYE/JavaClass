package EX;

public class ForEx09 {
	public static void main(String[] args) {
		
		for(int dan =2; dan<=9; dan++) {
			System.out.println("**** " + dan + "�� ****");
			for(int n=1; n<=9; n++) {
//				System.out.println(dan + "x" + n + "=" + (dan*n));
				System.out.printf("%2d x %2d = %2d\n", dan, n, (dan*n));
			}
		}
	}
}
