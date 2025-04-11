package project0411;

public class Circle extends Shape {
	double r;
	
	Circle(double r) {
		this(r, new Point(0,0));
//		this.r = r;
	}
	Circle(double r, Point p) {
		super(p);
		this.r = r;
	}
	Circle() {
		this(1);
	}
	
	@Override
	double calcArea() {
		return r*r*Math.PI;
	}
	
}
