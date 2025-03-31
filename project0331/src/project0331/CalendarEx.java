package project0331;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int hour2 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		System.out.println(year+"년 "+month+"월 "+day+" 일");
		System.out.println(hour+"시 "+minute+"분 "+sec+"초 ");
		System.out.println(hour2+"시 "+minute+"분 "+sec+"초 ");
		System.out.println(week);
				
	}
}
