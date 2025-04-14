package project0414;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		// Object클래스의 toString() -> 객체의 문자 정보 리턴
		System.out.println(obj1.toString());
		// Date클래스의 재정의한 toString() -> 날짜 정보 리턴
		System.out.println(obj2.toString());
	}
}
