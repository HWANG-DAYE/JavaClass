package project0328;

public class MultiArr02 {
	public static void main(String[] args) {
		
		int max1 = Integer.MIN_VALUE;
		int[][] arr1 = {{10,30,4}, {24,20,5}};
		for(int a=0; a<arr1.length; a++) {
			for(int b=0; b<arr1[a].length; b++) {
				System.out.printf("%3d", arr1[a][b]);
				if(max1<arr1[a][b]) max1 = arr1[a][b];
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		int max2 = Integer.MIN_VALUE;
		int[][] arr2 = {{10,20}, {30,40,50}};
		for(int c=0; c<arr2.length; c++) {
			for(int d=0; d<arr2[c].length; d++) {
				System.out.printf("%3d", arr2[c][d]);
				if(max2<arr2[c][d]) max2 = arr2[c][d];
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		int max3 = Integer.MIN_VALUE;
		int[][] arr3 = {{10,20}, {30,40}, {50}};
		for(int e=0; e<arr3.length; e++) {
			for(int f=0; f<arr3[e].length; f++) {
				System.out.printf("%3d", arr3[e][f]);
				if(max3<arr3[e][f]) max3 = arr3[e][f];
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		int max4 = Integer.MIN_VALUE;
		int[][] arr4 = {{1,2},{3,4,5},{6,7,8,9}};
		for(int g=0; g<arr4.length; g++) {
			for(int h=0; h<arr4[g].length; h++) {
				System.out.printf("%3d", arr4[g][h]);
				if(max4<arr4[g][h]) max4 = arr4[g][h];
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		int max5 = Integer.MIN_VALUE;
		int[] arr5 = {max1,max2,max3,max4};
		for(int i=0; i<arr5.length; i++) {
			System.out.printf("%3d", arr5[i]);	
			if(max5<arr5[i]) max5 = arr5[i];
		}
		System.out.println();
		
		System.out.printf("%3d", max5);
		
		}
	}

