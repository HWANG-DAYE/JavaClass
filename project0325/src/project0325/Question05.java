package project0325;

import java.util.Scanner;

public class Question05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String menu = "";
		int bal = 0;
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			menu = sc.nextLine();
			if("1".equals(menu)) {
				System.out.print("예금액 > ");
				int tmp = sc.nextInt(); //숫자
				sc.nextLine(); //엔터
				bal += tmp;
			} else if("2".equals(menu)) {
				System.out.print("출금액 > ");
				int tmp = sc.nextInt(); //숫자
				sc.nextLine();
				bal = bal - tmp;
			} else if("3".equals(menu)) {
				System.out.println("잔고 > " + bal);
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}


