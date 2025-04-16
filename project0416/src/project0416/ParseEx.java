package project0416;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ParseEx {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		// Date -> String
		String str = sdf.format(date);
		System.out.println(str);
		
		try {
			// String -> Date - "2024/03/02"
			Date newDate = sdf.parse(str);
			System.out.println(newDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// String -> LcalDate - "2024/03/02"
		str = "2025/12/12";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ld = LocalDate.parse(str, df);
		System.out.println(ld);
		
		// LocalDate -> String 
		df = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일");
		str = ld.format(df);
		System.out.println(str);
		
	}
}
