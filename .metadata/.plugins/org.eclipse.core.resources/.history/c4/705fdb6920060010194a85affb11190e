package project0321;

import java.util.Scanner;

public class RSP02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(1:가위, 2:바위, 3:보 ) : ");
		int p = sc.nextInt();
		int c = (int)(Math.random()*3+1);
		
		if(!(p>=1 && p<=3)) {
			System.out.println("잘못된 입력입니다.");
			System.out.println(0);
		}
		
		String player = (p==1? "가위" : (p==2)? "바위" : "보");
		String com = (c==1? "가위" : (c==2)? "바위" : "보");
		
		String res = "";
		
		if(p==c) res = "비겼습니다.";
		else if(p==1) {
			if(c==2) res = "player 패"; // p
			else res = "player 승";
		}
		else if(p==2) {
			if(c==3) res = "player 패"; // p
			else res = "player 승";
		}
		else if(p==3) {
			if(c==1) res = "player 패"; // p
			else res = "player 승";
		}
		System.out.println("사용자 :" + player +" \t컴퓨터 : "+com+ "\n" +res );
	}
}
