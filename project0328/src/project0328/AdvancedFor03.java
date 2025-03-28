package project0328;

public class AdvancedFor03 {
	public static void main(String[] args) {
		int[][] arr = {{10,20,30},{40,50}};
		
		for(int z=0; z<arr.length; z++) {
			for(int i=0; i<arr[z].length; i++) {
				System.out.printf("%d ", arr[z][i]);
			}
			System.out.println();
		}
		System.out.println("------------------");
		// 향상된 for문으로 출력?
		for(int[] items : arr) {
			for(int i : items) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
	}
}
