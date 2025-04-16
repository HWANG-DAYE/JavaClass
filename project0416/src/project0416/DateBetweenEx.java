package project0416;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateBetweenEx {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2024, 2, 10, 0, 0);
		LocalDateTime end = LocalDateTime.of(2024, 4, 12, 0, 0); // 2개월 2일
		
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toDays());
		System.out.println(duration.getSeconds());
		System.out.println(62*24*60*60);
		
		// LocalDate의 차이만 계산이 가능 : LocalDateTime -> LocalDate변환
		// 단순한 연, 월, 일 차이만 계산
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		System.out.println(period.getMonths()+"개월 " + period.getDays()+"일 ");
		
		// 전체 기간을 기준으로, 설정한 단위에 맞추어서 계산
		long remain = ChronoUnit.DAYS.between(start, end);
		long remains = ChronoUnit.SECONDS.between(start, end);
		System.out.println(remain);
		System.out.println(remains);
	}
}
