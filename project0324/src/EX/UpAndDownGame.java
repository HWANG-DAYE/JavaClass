package EX;

import java.util.Scanner;

public class UpAndDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = (int) (Math.random() * 50) + 1;
		int i = 0;
		for (i = 3; i >= 1; i--) {
			System.out.print("1부터 50까지의 정수를 입력 : ");
			int play = sc.nextInt();
			if (play < res) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (play > res) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		}
		if (i == 0) {
			System.out.println("정답은 " + res + "였습니다.");
		}
	}
}
