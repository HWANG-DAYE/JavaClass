package project0328;

public class MultiArr {
	public static void main(String[] args) {
		int[][] arr = {{98,99}, {100,80,70}, {50,60}};
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg = 0.0;
		int cnt = 0;
		for(int z=0; z<arr.length; z++) { // ���� ����
			for(int i=0; i<arr[z].length; i++) { // ���� ����
				sum = sum+arr[z][i];
				System.out.printf("%3d", arr[z][i]);
				if(max<arr[z][i]) max = arr[z][i];
				if(min>arr[z][i]) min = arr[z][i];
				cnt++;
			}
			System.out.println();
		}
		avg = sum / (double)cnt;
		System.out.println("�� : " + sum);
		System.out.println("��� " + avg);
		System.out.println("�ִ� : " + max + "�ּ� : " + min);
	}
}
