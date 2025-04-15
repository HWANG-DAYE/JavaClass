package project0415;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
//		LocalDateTime now = LocalDateTime.of(2020,11,1,14,2,29);
		System.out.println("오늘 날짜 " + now);
		
		LocalDateTime  targetDateTime = null;
	
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
			System.out.println("이번해의 첫 일 " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
			System.out.println("이번해의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
			System.out.println("다음 해의 첫 일 " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
			System.out.println("이번달의 첫 일 " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
			System.out.println("이번달의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
			System.out.println("다음달의 첫 일: " + targetDateTime);
			 
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
			System.out.println("이번달의 첫 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
			System.out.println("돌아오는 금요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
			System.out.println("지난 월요일: " + targetDateTime);
	}
}

