package project0407;

public class CastEx {
	public static void main(String[] args) {
		plus(1, 2);
		check(new MyParent());
		check(new MyChild());

		MyParent p = new MyChild();
		p.method1();

		MyChild c = new MyChild();
		c.method1();
		c.method2();

		MyParent p2 = new MyParent();
		p2.method1();
	}

	public static void plus(double a, double b) {
		System.out.println(a + b);
	}

	public static void check(MyParent p) {
		p.method1();
	}
}

class MyParent {
	public void method1() {
		System.out.println("부모 메소드1");
	}
}

class MyChild extends MyParent {
	@Override
	public void method1() {
		System.out.println("자식 메소드1 - 재정의 함");
	}

	public void method2() {
		System.out.println("자식만이 가지고 있는 메소드야!");
	}
}
