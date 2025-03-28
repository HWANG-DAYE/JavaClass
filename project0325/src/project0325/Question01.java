//3. for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성해보세요.

package project0325;

public class Question01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3의 배수의 총합은 : " + sum + "입니다.");
		
	}
}
