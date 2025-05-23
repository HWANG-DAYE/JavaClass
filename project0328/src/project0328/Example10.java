package project0328;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		boolean run = true;		
		int studentNum = 0; // 학생수
		Scanner sc = new Scanner(System.in);
		int[] scores = null; // 점수 배열
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			
			} else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = sc.nextInt();
				}
			
			} else if(selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
			
			} else if(selectNo == 4) { // 분석
				int sum = 0;
				int max = Integer.MIN_VALUE;
				for(int score : scores) {
					sum = sum + score;
					if(max < score) max = score;
				}
				System.out.println("최대 : " + max);
				System.out.println("평균 : " + (sum / (double)scores.length));
			} else if(selectNo == 5) {
				run = false;
			}
		}	
		
		System.out.println("프로그램 종료");
	}
}

