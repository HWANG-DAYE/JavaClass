package project0402;

public class Company {
	private Company() {}

	private static Company instance = new Company();

	public static Company getInsatance() {
		return instance;
	}
}
