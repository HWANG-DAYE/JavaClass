package project0411;

public abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의면적을계산해서반환하는메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

	
public static double sumArea(Shape[] arr) {
	double res = 0.0;
	for(Shape s : arr) {
		res += s.calcArea();
	}
	return res;
	
}
public static void main(String[] args) {
	Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
	System.out.println("면적의 합 : " + sumArea(arr));
}
}
