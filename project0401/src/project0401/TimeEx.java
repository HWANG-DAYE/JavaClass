package project0401;

import java.util.Date;

public class TimeEx {
	public static void main(String[] args) throws InterruptedException{
		Time t = new Time();
		System.out.println(new Date());
		Thread.sleep(2000);
		System.out.printf("현재시간은 %d시 %d분 %d초 입니다.\n", t.h, t.m, t.s);
		System.out.printf("현재시간은 %d시 %d분 %d초 입니다.\n", t.currentH(), t.currentM(), t.currentS());
		System.out.printf("현재시간은 %d시 %d분 %d초 입니다.\n", t.h, t.m, t.s);
		
	}
}
