package project0417;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties  = new Properties(); // key, value 타입 모두 String 고정
		
		// 절대경로 
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8"); // 경로에 한글이 있을 경우
		System.out.println(path);
		
		
		// 파일객체로부터 properties를 생성
		properties.load(new FileReader(path));
		
		// driver key값에 대응되는 value값을 반환
		String driver = properties.getProperty("driver"); 
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		String country = properties.getProperty("country");		
		
		System.out.println("driver : " + properties.getProperty("driver"));
		System.out.println("url : " + properties.getProperty("url"));
		System.out.println("username : " + properties.getProperty("username"));
		System.out.println("password : " + properties.getProperty("password"));

		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("country : " + country);
	}
}
