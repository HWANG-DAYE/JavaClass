package ch02.sec01;

public class OperationEx {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int res = byteValue1 + byteValue2;
//		byte res = byteValue1 + byteValue2; // byte+byte -> int이므로 byte 변수에 저장할 수 없음
		
		char c1 = 'A';
		char c2 = 1;
		int res2 = c1 + c2; // char + char -> int
		char c3 = (char)(c1+c2); //만약 문자 'B'를 저장하고 싶다면 강제 타입으로 char 타입으로 변환
		System.out.println(c3); // 'B'
	}
}
