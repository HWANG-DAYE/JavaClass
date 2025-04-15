package project0415;

import java.util.regex.Pattern;

public class PatternEx {
	public static void main(String[] args) {
		// \이스케이프 문자에서 쓰이므로 \\가 \을 의미함
		String reg = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean res = Pattern.matches(reg, data);
		
		if(res) System.out.println("정규식과 일치");
		else System.out.println("정규식과 일치하지 않음");
		
		// \\ 이스케이프 문자로 역슬래시 하나의 문자열로 표현
		reg = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angle@navercom";
		res = Pattern.matches(reg, data);
		
		if(res) System.out.println("정규식과 일치");
		else System.out.println("정규식과 일치하지 않음");
		
		reg = "(010|011)-\\d{4}-\\d{4}";
		data = "010-1233-0070";
		if(res) System.out.println("정규식과 일치");
		else System.out.println("정규식과 일치하지 않음");
	}
}
