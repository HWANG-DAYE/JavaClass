package project0328;

public class MultiArr02_2 {
	public static void main(String[] args) {
		int[] maxs = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		int[][] arr = {{10,30,4}, {24,20,5}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
				if(maxs[0] < arr[i][j]) maxs[0] = arr[i][j];
			}
			System.out.println();
		}
		System.out.println("최대 :" + maxs[0]);
		
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		int tmp = 10;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = tmp;
				tmp = tmp+10;
				System.out.printf("%3d", arr2[i][j]);
				if(maxs[1] < arr2[i][j]) maxs[1] = arr2[i][j];
			}
			System.out.println();
		}
		System.out.println("최대 : "+ maxs[1]);
		
		tmp = 10; // 10씩 증가하고, 처음값이 10이므로 10으로 초기화
		int[][] arr3 = new int[3][];
		arr3[0] = new int[2];
		arr3[1] = new int[2];
		arr3[2] = new int[1];
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = tmp;
				tmp = tmp+10;
				System.out.printf("%3d", arr3[i][j]);
				if(maxs[2] < arr3[i][j]) maxs[2] = arr3[i][j];
			}
			System.out.println();
		}
		System.out.println("최대 : "+ maxs[2]);		
		
		int[][] arr4 = new int[3][];
		arr4[0] = new int[2];
		arr4[1] = new int[3];
		arr4[2] = new int[4];
		tmp = 1; // 1씩 증가하고, 처음값이 1이므로 1로 초기화
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				arr4[i][j] = tmp;
				tmp = tmp+1;
				System.out.printf("%3d", arr4[i][j]);
				if(maxs[3] < arr4[i][j]) maxs[3] = arr4[i][j];
			}
			System.out.println();
		}
		System.out.println("최대 : "+ maxs[3]);	
		
		int totalMax = Integer.MIN_VALUE;
		for(int i=0; i<maxs.length; i++) {
			if(totalMax < maxs[i]) totalMax = maxs[i];
		}
		System.out.println("가장 큰 값 : " + totalMax);
	}
}
