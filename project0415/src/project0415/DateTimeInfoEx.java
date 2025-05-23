package project0415;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getDayOfMonth() + "일 ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "나노초 ";
		System.out.println(strDateTime + "\n");
		
		// LocalDate에만 있으므로 toLocalDate()로 LocalDate로 변환 후 사용 가능
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
		} else {
			System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
		}
		
		//협정 세계시와 존 오프셋
		// 시차 + LocalDateTime
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시: " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임존: " + seoulDateTime);
		
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("서울 존아이디: " + seoulZoneId);
		
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울 존오프셋: " + seoulZoneOffset + "\n");
	}
}
