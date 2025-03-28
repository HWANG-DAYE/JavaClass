package project0327;

public class Array07 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%2d", arr[i]);
		}
		System.out.println("\n-------------------");
		int [] arr2 = {1,2,3,4,5};
		int tmp;
		for(int i=0; i<arr2.length; i++) {
			int n = (int)(Math.random()*5); // 인덱스(배열에 해당하는 인덱스값 <-> arr[i] 변수값 바꾸기!)
			tmp = arr2[i];
			arr2[i] = arr[n];
			arr[n] = tmp;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%2d", arr2[i]);
		}
	}
}
