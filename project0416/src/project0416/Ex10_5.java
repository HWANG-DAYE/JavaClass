package project0416;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex10_5 {
	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
		System.out.println(getDayDiff2("20010103", "20010101"));
		System.out.println(getDayDiff2("20010103", "20010103"));
		System.out.println(getDayDiff2("20010103", "200103"));
	}
	

	public static int getDayDiff(String day2, String day1) {
		int remainDay = 0;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd");
		try {
			LocalDate start = LocalDate.parse(day1, df);
			LocalDate end = LocalDate.parse(day2, df);
			remainDay = (int)(ChronoUnit.DAYS.between(start, end));
		} catch (Exception e) {
			return 0;
		}
		return remainDay;
	}
	
	public static int getDayDiff2(String day2, String day1) {
		int remainDay = 0;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd");
		try {
			LocalDate start = LocalDate.parse(day1, df);
			LocalDate end = LocalDate.parse(day2, df);
			remainDay = Period.between(start,end).getDays(); // 단순한 일차이
		} catch (Exception e) {
			return 0;
		}
		return remainDay;
	}
}
