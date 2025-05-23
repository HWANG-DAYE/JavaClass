/**
 * 4. while 문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 
 * 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 
 * 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 
 * 눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.
 */

package project0325;

public class Question02 {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		
		while(true) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
			
			if(dice1+dice2==5) break;
		}
		
		System.out.println("-----------------");
		
		dice1=0;
		dice2=0;
		while(dice1 + dice2 != 5) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
		}
	}
}
