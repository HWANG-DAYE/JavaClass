package project0409;

import java.util.Scanner;

public class MemberApplication {
	static private Member[] arr = new Member[100];
	static private Scanner sc = new Scanner(System.in);
	static private int cnt = 0; // 등록된 회원수의 수
	public static void main(String[] args) {
		boolean run = true;		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.비밀번호찾기 | 4.아이디찾기 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createMember();
			} else if(selectNo == 2) {
				login();
			} else if(selectNo == 3) {
				searchPwd();
			} else if(selectNo == 4) {
				searchId();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void searchPwd() {
		System.out.print("아이디 >");
		String id = sc.next();
		System.out.print("이름 > ");
		String name = sc.next();
		Member m = searchMember(id, name ,2);
		if(m==null) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}
		System.out.print("변경할 비밀번호 >");
		String pwd = sc.next();
		m.setPwd(pwd);
		System.out.println("비밀번호 변경이 완료되었습니다.");
	}
	private static void searchId() {
		System.out.print("이름 > ");
		String name = sc.next();
		System.out.print("전화번호 >");
		String phone = sc.next();
		Member m = searchMember(phone, name ,3);
		if(m==null) {
			System.out.println("등록된 회원이 없습니다.");
			return;
		}
		String id = m.getId().substring(0, m.getId().length()-4)+"****";
		System.out.println(id);
		System.out.println();
	}
	private static void login() {
		System.out.print("아이디 >");
		String id = sc.next();
		System.out.print("비밀번호 > ");
		String pwd = sc.next();
		Member m = searchMember(id, pwd, 1);
		if(m==null) {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println(m.getName()+"님 환영합니다.");
	}
	
	
	private static Member searchMember(String search1, String search, int n) {
		for(int i=0; i<cnt; i++) {
			if(n==1) {
				if(arr[i].getId().equals(search1)&& arr[i].getPwd().equals(search)) {
					return arr[i];
				}
			}else if(n==2) {
				if(arr[i].getId().equals(search1)&& arr[i].getName().equals(search)) {
					return arr[i];
				}
			}else if(n==3) {
				if(arr[i].getPhone().equals(search1)&& arr[i].getName().equals(search)) {
					return arr[i];
				}
			}

		}
		return null;
	}
	private static void createMember() {
		System.out.print("아이디 >");
		String id = sc.next();
		System.out.print("비밀번호 > ");
		String pwd = sc.next();
		System.out.print("이름 > ");
		String name = sc.next();
		System.out.print("휴대전화 > ");
		String phone = sc.next();
		Member m = new Member(id, pwd, name, phone);
		arr[cnt] = m;
		cnt++;
	}
}
