package project0321;

import java.util.Scanner;

public class RandomEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String me = sc.next();
		System.out.println("사용자 : " + me);
		
		int p = 0;
		
		switch(me) {
		case "가위" :
			p = 0;
			break;
		case "바위" :
			p = 1;
			break;
		case "보" :
			p = 2;
			break;
		}
		
		int computer = (int)(Math.random()*3);
//		System.out.println(number);
		String com = "";
//		if(number==1) {
//			num="가위";
//		} else if(number==2) {
//			num="바위";
//		} else {
//			num="보";
//		}
//		System.out.println(num);
		
		com = computer==0? "가위" : computer==1? "바위" : "보";
		System.out.println("컴퓨터 : " + com);
		
		System.out.println(p + "/" + computer);
		
//		이기고 지고 비기고 추가
		if(p == computer) {
			System.out.println("비겼다.");
		} else if( (p == 0 && computer == 1) 
					|| ( p == 1 && computer == 2) 
					|| ( p == 2 && computer == 0)) {
			System.out.println("졌다.");
		}else {
			System.out.println("이겼다.");
		}
	}
}
