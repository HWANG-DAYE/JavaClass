package project0407;

public class ChildEx0 {
	public static void main(String[] args) {
		Parent0 parent0 = new Child0();
		parent0.field1 = "data1";
		parent0.method1();
		parent0.method2();
		/**
		 * parent.field2 = "data2"; // (불가능)
		 * parent.method3();		// (불가능)
		 */
		
		Child0 child0 = (Child0) parent0;
		child0.field2 = "yyy"; // (가능)
		child0.method3();	   // (가능)
	}
}
