package project0328;

public class AdvancedFor02 {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int[] arr2;
		arr2 = new int[] {40,50,60};
		int[] arr3 = new int[3];
		
		for(int item : arr) {
			System.out.printf("%3d", item);
		}
		System.out.println("\n-----------");
		
		for(int item : arr2) {
			System.out.printf("%3d", item);
		}
		System.out.println("\n-----------");
		
		for(int item : arr3) {
			System.out.printf("%3d", item);
		}
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = i+1;
		}
		System.out.println("\n-----------");
	}
}
