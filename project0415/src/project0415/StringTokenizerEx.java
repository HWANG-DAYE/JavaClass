package project0415;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
	String text = "홍길동/이수홍/박연수";
	
	// 1. 전체 토큰 수를 얻어 for문으로 루핑
	StringTokenizer st = new StringTokenizer(text, "/");
	int countTokens = st.countTokens();
	for(int i=0; i<countTokens; i++) {
		String token = st.nextToken();
		System.out.println(token);
	}
	
	System.out.println();
	
	// 2. 남아있는 토큰을 확인하고 while문으로 루핑
	st = new StringTokenizer(text, "/");
	while(st.hasMoreTokens()) {
		String token = st.nextToken();
		System.out.println(token);
	}
	}
}
