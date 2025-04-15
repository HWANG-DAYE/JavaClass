package project0415;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterEx {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String str = sdf.format(date);
		System.out.println(str);
		
		try {
			Date newDate = sdf.parse(str);
			System.out.println(newDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		LocalDate ld = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		str = ld.format(df);
		System.out.println(str);
		
		LocalDate newLocalDate = LocalDate.parse(str, df);
		System.out.println(newLocalDate);
	}
}
