package project0416;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex10_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		while (true) {
			try {
				System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
				System.out.print(">>");
				String str = sc.next();
				Date date = sdf.parse(str);
				sdf = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
				System.out.println(sdf.format(date));
				return;
			} catch (Exception e) {

			}
		}

	}
}
