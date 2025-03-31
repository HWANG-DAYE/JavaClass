package project0331;

public class Ex36_While {
	public static void main(String[] args) {
		int z=0;
		while(z<=10) {
			int j=0;
			while(j<z) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			z++;
		}
	}
}
