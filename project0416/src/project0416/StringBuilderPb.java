package project0416;

public class StringBuilderPb {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		String res = sb.toString();
		System.out.println(res);
		
		System.out.println(str.equals(res));
	}
}
