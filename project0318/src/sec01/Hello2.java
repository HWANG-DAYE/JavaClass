package sec01;

public class Hello2 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
//		System.out.println(x);
//		System.out.println(y);
		System.out.println("x:" + x + ", y:" + y);
		
		int tmp;
		tmp = x;
		x = y;
		y = tmp ;
		
		System.out.println(x);
		System.out.println(y);
	}

}
