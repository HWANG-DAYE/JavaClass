package project0320;

import java.util.Scanner;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int score = sc.nextInt();
//		char grade = (score > 90) ? 'A' :((score > 80) ? 'B' : 'C');
//		System.out.println(score + "점은 " + grade + "등급입니다.");
	    String number = score % 2 == 0 ? "짝수" : "홀수";	
	    System.out.println(number);
	}
}
