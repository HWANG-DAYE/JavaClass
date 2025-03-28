package project0325;

public class ForEx01 {
	public static void main(String[] args) {
		
		for(int z=1; z<=5; z++) {
			for(int s=1; s<=5-z; s++) {
				System.out.print("  "); // %2d가 두칸이라 공백도 두칸
			}
			for(int i=z; i>=1; i--) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		for(int z=5; z>=1; z--) {
			for(int s=1; s<=z-1; s++) {
				System.out.print("  "); // %2d가 두칸이라 공백도 두칸
			}
			for(int i=z; i<=5; i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
		}
	}
} // 이해 잘 안됨 잘 모르겠음 이거저거 바꾸다가 얼레벌레 결과가 나옴
