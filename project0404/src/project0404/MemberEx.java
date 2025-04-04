package project0404;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {
		Member[] arr = new Member[3];
		Scanner sc = new Scanner(System.in);
		Member m0 = null;
		Member m1 = null;
		Member m2 = null;
		
		System.out.println("아이디 > ");
		String id = sc.next();
		System.out.println("비밀번호 > ");
		String pwd = sc.next();
		
		m0 = new Member();
		m0.setId(id);
		m0.setPwd(pwd);
		
		System.out.println("아이디 > ");
		id = sc.next();
		System.out.println("비밀번호 > ");
		pwd = sc.next();
		m1 = new Member(id, pwd);
		
		System.out.println("아이디 > ");
		id = sc.next();
		System.out.println("비밀번호 > ");
		pwd = sc.next();
		m2 = new Member(id, pwd);
		
		

	}
}
