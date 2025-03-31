package project0331;

import java.util.Calendar;

public class WeekExample2 {
	public static void main(String[] args) {
		//Week 열거 타입 변수 선언
		Week today = null;
		
		//Calendar  얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1:일 2:월..
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		Week[] arr = {null,Week.SUNDAY, Week.MONDAY, Week.TUESDAY, Week.WEDNESDAY,
					  Week.THURSDAY, Week.FRIDAY, Week.SATURDAY};
		System.out.println("오늘 요일 : " + arr[week]);
		
		if(arr[week] == Week.SUNDAY) {
			System.out.println("일요일");
		} else {
			System.out.println("열심히 자바 공부를 하지 않네요..");
		}
	}
}
