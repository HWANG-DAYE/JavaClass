package project0321;

public class ForEx {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println("-------------------------");

		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		for(int i=1; i<=9; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		for(int i=1; i<=10; i+=2) {
			if(i%2==1) {
			System.out.println(i);
		}
		
		}
	}
}
