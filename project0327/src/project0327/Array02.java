package project0327;

public class Array02 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		//값 목록으로 배열 생성
		int[] scores2;
		scores2 = new int[] { 100,50,90 };
		
		int [] scores3 = new int[3];
		
		System.out.println("----- 값 목록으로 출력 -----");
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		System.out.println("-------------------------");
		System.out.println("score[0] : " + scores2[0]);
		System.out.println("score[1] : " + scores2[1]);
		System.out.println("score[2] : " + scores2[2]);
		System.out.println("----- new 연산자 이용 -----"); //기본값으로 초기화
		System.out.println("score[0] : " + scores3[0]);
		System.out.println("score[1] : " + scores3[1]);
		System.out.println("score[2] : " + scores3[2]);
		
		// 배열이 생성되고 나서 새로운 값을 저장(대입연산자 이용)
		scores3[0] = 83;
		scores3[1] = 70;
		scores3[2] = 95;
		System.out.println("----- new+대입연산자 이용 -----");
		System.out.println("score[0] : " + scores3[0]);
		System.out.println("score[1] : " + scores3[1]);
		System.out.println("score[2] : " + scores3[2]);
	
		
		
	}
}
