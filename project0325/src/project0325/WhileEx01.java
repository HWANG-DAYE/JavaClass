package project0325;

public class WhileEx01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum =sum + i;
		}
		System.out.println(sum);
		
		System.out.println("--------");
		
		sum=0; // 이거 안 하면 위에서 구해진 sum값에 이어서 계산되기 때문에 초기화 필요.
		int i=1;
		while(i<=100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
}
