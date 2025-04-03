package project0403;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static Account2 searchAno(String ano) {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			}
		}
		return null;
	}

	private static void withdraw() {
		System.out.println("계좌번호 > ");
		String ano = scanner.next();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					System.out.println("출금액 > ");
					int tmp = scanner.nextInt();
					accountArray[i].setBal(accountArray[i].getBal()-tmp);
					return;
				}
			}
		}
	}

	private static void deposit() {
		System.out.println("계좌번호 > ");
		String ano = scanner.next();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					System.out.println("입금액 > ");
					int tmp = scanner.nextInt();
					accountArray[i].setBal(accountArray[i].getBal()+tmp);
					return;
				}
			}
		}
	}

	private static void accountList() {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				System.out.printf("%10s %10s %10d\n", accountArray[i].getAno(),
									 accountArray[i].getName(), accountArray[i].getBal());
			}
		}
	}

	private static void createAccount() {
		System.out.println("계좌번호 > ");
		String ano = scanner.next();
		System.out.println("계좌주 > ");
		String name = scanner.next();
		System.out.println("초기입금액 > ");
		int bal = scanner.nextInt();
		Account2 account = new Account2(ano, name, bal);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
	}

}