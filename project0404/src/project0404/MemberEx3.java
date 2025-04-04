package project0404;

import java.util.Scanner;

public class MemberEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] arr = {new Member(), new Member(), new Member() };
		
		for(Member m : arr) {
			System.out.println("아이디 > ");
			String id = sc.next();
			System.out.println("비밀번호 > ");
			String pwd = sc.next();
			
			m.setId(id);
			m.setPwd(pwd);
			System.out.println(m.getId() + " / " + m.getPwd());
		}
		for(Member m : arr) {
			System.out.println(m.getId() + " / " + m.getPwd());
		}
	}
}
