package project0327;

public class Array09 {
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		
		System.out.printf("%2d", arr[0][0]);
		System.out.printf("%2d", arr[0][1]);
		System.out.printf("%2d", arr[0][2]);
		System.out.println();
		System.out.printf("%2d", arr[1][0]);
		System.out.printf("%2d", arr[1][1]);
		System.out.printf("%2d", arr[1][2]);
		System.out.printf("%2d", arr[1][3]);
		System.out.println();
		System.out.println("-----------------");
		
		for(int i=0; i<arr[0].length; i++) {
			System.out.printf("%2d", arr[0][i]);
		}
		System.out.println();
		
		for(int i=0; i<arr[1].length; i++) {
			System.out.printf("%2d", arr[1][i]);
		}
		System.out.println();
		
		System.out.println("------------------");
		
		for(int z=0; z<arr.length; z++) {
			for(int i=0; i<arr[z].length; i++) { // 행의 길이
				System.out.printf("2%d", arr[z][i]); // 그 행에 해당하는 열의 길이
			}
			System.out.println();
		}
	}
}
