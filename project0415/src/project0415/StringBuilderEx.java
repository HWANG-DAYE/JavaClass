package project0415;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program study");
		
		System.out.println(sb); // 매개값으로 객체가 오면 객체의 tostring()호출
		System.out.println(sb.toString()); // Java Program Study
		
		sb.insert(4, "2"); // 4번째 위치에 "2"추가
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6'); // 4번째 위치에 문자를 '6'으로 바꿈
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book"); // 6부터 12(13)번째까지 "book"으로 바꿈
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.delete(4, 5); // 4번째부터 4(5)번째까지 문자 삭제
		System.out.println(sb);
		System.out.println(sb.toString());
		
		int len = sb.length();
		System.out.println("총 문자수 : " + len);
		String res = sb.toString();
		System.out.println(res);
		
	}
}
