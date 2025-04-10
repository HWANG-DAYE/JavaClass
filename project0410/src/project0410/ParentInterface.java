package project0410;

public interface ParentInterface {
	public void method1();
	public default void method2() {System.out.println("Pi-m2");}
}
