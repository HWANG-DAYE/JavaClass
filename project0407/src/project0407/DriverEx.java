package project0407;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 해당 객체 뿐만 아니라 자식객체까지도 매개 값으로 사용 가능
		// 재정의 된 run() 호출
		driver.drive(bus);
		driver.drive(taxi);
	}
}
