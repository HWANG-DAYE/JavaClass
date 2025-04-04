package project0404;

import java.util.Scanner;

public class MemberEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] arr = new Member[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("아이디 > ");
			String id = sc.next();
			System.out.println("비밀번호 > ");
			String pwd = sc.next();
			arr[i] = new Member(id,pwd);
			
			System.out.println(arr[i].getId() + " / " + arr[i].getPwd());
		}
	}
}
