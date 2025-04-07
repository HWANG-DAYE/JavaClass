package project0407;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
//			} else if(selectNo == 2) {
//				accountList();
//			} else if(selectNo == 3) {
//				deposit();
//			} else if(selectNo == 4) {
//				withdraw();
//			} else if(selectNo == 5) {
//				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("계좌주 : ");
		String name = scanner.next();
		System.out.println("초기입금액 : ");
		int bal = scanner.nextInt();
		Account account = new Account(ano,name,bal);
		System.out.println("결과 : ");
	}
}
