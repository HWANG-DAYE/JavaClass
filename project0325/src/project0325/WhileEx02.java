package project0325;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("-----------------------------");
			System.out.print("����: ");
			
			String strNum = scanner.nextLine();
			
			if("1".equals(strNum)) {
				speed++; // speed = speed + 1;
				System.out.println("���� �ӵ� = " + speed);
			} else if("2".equals(strNum)) {
				speed--; // speed = speed - 1
				System.out.println("���� �ӵ� = " + speed);
			} else if("3".equals(strNum)) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
