package EX;

public class ForEx12 {
	public static void main(String[] args) {
		for(int z=1; z<=5; z++) {
			for(int i=1; i<=z; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int z=1; z<=5; z++) {
			for(int s=1; s<=5-z; s++) {
				System.out.print("  ");
			}
			for(int i=z; i>=1; i--) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int z=5; z>=1; z--) {
			for(int i=1; i<=z; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int z=5; z>=1; z--) {
			for(int i=z; i>=1; i--) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int z=5; z>=1; z--) {
			for(int i=z; i<=5; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		System.out.println("-------------");
	
	}
}
