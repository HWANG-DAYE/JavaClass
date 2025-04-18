package project0418;

public class Ex5_8 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		// counter 초기화 for문
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] ==1) counter[0]++;
			else if(answer[i] ==2) counter[1]++;
			else if(answer[i] ==3) counter[2]++;
			else if(answer[i] ==4) counter[3]++;
		}
		// * 찍 for문
		for (int i = 0; i < counter.length; i++) {
			System.out.println(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
