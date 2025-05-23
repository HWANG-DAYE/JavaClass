package EX;

public class PrintEx01 {
	public static void main(String[] args) {
		int n = 32;
		System.out.printf("%3d\n", n);
		System.out.printf("%-3d\n", n);
		
		double d = 3.141592;
		System.out.printf("%6.3f\n", d);
		System.out.printf("%.3f\n", d);
		System.out.printf("%f\n", d);
		
		System.out.println("%");
		System.out.printf("%%");
		System.out.println("--------------------------");

		int dan = 5;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
		System.out.println("--------------------------");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan*i));
		}
	}
}
