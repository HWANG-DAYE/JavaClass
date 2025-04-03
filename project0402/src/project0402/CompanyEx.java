package project0402;

public class CompanyEx {
	public static void main(String[] args) {
		Company mycom1 = Company.getInsatance();
		Company mycom2 = Company.getInsatance();
		
		System.out.println("mycom1 : " + mycom1);
		System.out.println("mycom2 : " + mycom2);
	}
}
