package EX;

public class ForEx06 {
	public static void main(String[] args) {
		System.out.printf("%2d", 1);
		System.out.printf("%2d", 2);
		System.out.printf("%2d", 3);
		System.out.printf("%2d", 4);
		System.out.printf("%2d", 5);
		System.out.println();
		
		System.out.printf("%2d", 1);
		System.out.printf("%2d", 2);
		System.out.printf("%2d", 3);
		System.out.printf("%2d", 4);
		System.out.printf("%2d", 5);
		System.out.println();
		
		System.out.printf("%2d", 1);
		System.out.printf("%2d", 2);
		System.out.printf("%2d", 3);
		System.out.printf("%2d", 4);
		System.out.printf("%2d", 5);
		System.out.println();
		
		System.out.println("-----------------");
		
		for(int i=1; i<=5; i++) {
			System.out.printf("%2d",i);
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.printf("%2d",i);
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.printf("%2d",i);
		}
		System.out.println();
		
		System.out.println("-----------------");
		
		for(int z=3; z>=1; z--) {
			for(int i=1; i<=5; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for(int z=1; z<=3; z++) {
			for(int i=1; i<=5; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
	}
}
