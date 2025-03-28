package ch02.sec01;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; // ! 논리 부정 연산자 (true -> false)
		System.out.println(play);
		
		play = !play; // (false -> true)
		System.out.println(play);
	}
}
