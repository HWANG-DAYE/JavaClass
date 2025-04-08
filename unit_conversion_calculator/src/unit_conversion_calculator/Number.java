package unit_conversion_calculator;

public class Number {
	public boolean isNumber(String input) {
		// 입력값이 null이거나 공백일 경우 숫자가 아님 -> false
		if(input == null || input.equals("")) return false;
		
		// 
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(!(c >= '0' && c<= '9') && c !='.') {
				return false;
			}
		}
		return true;
	}
}
