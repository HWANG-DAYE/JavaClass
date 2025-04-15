package project0415;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeCompareExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] start = str.split(" "); // [2020, 10, 05, 10, 10, 0]
		int[] istart = new int[6];
		for(int i=0; i<istart.length; i++) {
			istart[i] = Integer.parseInt(start[i]); // String -> int
		}
		LocalDateTime startDateTime = LocalDateTime.of(istart[0], istart[1], istart[2], istart[3], istart[4], istart[5]);
		
		String[] send = str.split(" ");
		int[] end = new int[6];
		for(int i=0; i<send.length; i++) {
			end[i] = Integer.parseInt(send[i]);
		}
		LocalDateTime endDateTime = LocalDateTime.of(end[0], end[1], end[2], end[3], end[4], end[5]);
		
		//--------------------------------------------------------------
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중입니다.." + "\n");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다" + "\n");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다." + "\n");
		}
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 해: " + remainYear);
		System.out.println("남은 달: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond + "\n");
		//--------------------------------------------------------------
		System.out.println("[종료까지 남은 기간]");
		// LocalDateTime -> LocalDate toLocalDate()
		Period period 
			= Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간: " + period.getYears() + "년");
		System.out.print(period.getMonths() + "월 ");
		System.out.println(period.getDays() + "일\n");
		//--------------------------------------------------------------
		// LocalDateTime -> LocalTime toLocalTime()
		Duration duration = 
				Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("남은 초: " + duration.getSeconds());
	}
}

