package project0331;

public class MainEx {
	public static void main(String[] args) {
		String arr = "1";
		int a = Integer.parseInt(arr);
		System.out.println(a);
		
		int b = Integer.valueOf(arr);
		System.out.println(b);
		
		arr = "1.5";
		double c = Double.parseDouble(arr);
		System.out.println(c);
		
		double d = Double.valueOf(arr);
		System.out.println(d);
		
		double e = 1.5;
		arr = e+"";
		System.out.println(arr);
	}
}
