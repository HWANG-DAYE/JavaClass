package project0320;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		// 타입 변수이름 = new 타입(필요한 정보);
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : "); // Scanner 입력과 관련되 안내 문구를 출력하는 용도
//		String str = sc.nextLine(); // 공백 포함해서 엔터 전까지 입력을 받습니다.
//		String str = sc.next(); // 공백 전까지
//		System.out.println(str);
		
		System.out.print("정수 입력 : ");
		int x = sc.nextInt(); // 정수를 입력
		
		System.out.print("실수 입력 : ");
		double y = sc.nextDouble(); // 실수를 입력
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		sc.close();
	}
}
