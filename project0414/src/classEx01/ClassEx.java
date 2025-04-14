package classEx01;

public class ClassEx {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackageName());
		
		try {
			Class clazz1 = Class.forName("classEx01.Car");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			System.out.println(clazz.getPackageName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class clazz2 = Car.class;
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackageName());
	}
}
