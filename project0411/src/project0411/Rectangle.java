package project0411;

public class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	Rectangle(double width, double height, Point p) {
		super(p);
		this.width = width;
		this.height = height;
	}
	Rectangle() {
		this(1,1);
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return width * height!= 0 && width == height;
	}
	
}
