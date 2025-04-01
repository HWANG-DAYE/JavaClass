package project0401;

public class CarEx2 {
	public static void main(String[] args) {
		Car2 c = new Car2();
		c.setGas(5);

		if (c.isLeftGas()) {

			System.out.println("출발합니다.");
			c.run();
		}
		if (c.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
