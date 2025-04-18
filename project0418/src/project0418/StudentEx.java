package project0418;

import java.util.Scanner;

public class StudentEx {
	static Student[] arr = new Student[100]; // 100개 배열
	static Scanner sc = new Scanner(System.in);
	static int cnt = 0; // 학생수
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.학생등록| 2.학생목록|3.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 1) {
				registerMember();
			}else if(selectNo == 2) {
				memberList();
			}else if(selectNo == 3) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void memberList() {
		for(int i=0; i<cnt; i++) {
			System.out.println(arr[i]);
		}
	}
	private static void registerMember() {
		System.out.print("이름>");
		String name = sc.next();
		System.out.print("학년>");
		int grade = sc.nextInt();
		System.out.print("반>");
		int ban = sc.nextInt();
		System.out.print("번호>");
		int num = sc.nextInt();
		Student std = new Student(name, ban, grade, num);
		arr[cnt] = std;
		cnt++;
		System.out.println("학생이 등록되었습니다.");
		
	}
}