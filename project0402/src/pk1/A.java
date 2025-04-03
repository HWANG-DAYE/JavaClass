package pk1;

public class A {
	public A(boolean b) {}
	A(int b){}
	private A(String s) {}
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
}

