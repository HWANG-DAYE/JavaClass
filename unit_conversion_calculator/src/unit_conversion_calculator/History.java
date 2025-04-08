package unit_conversion_calculator;

public class History {
	private String Results = "";
	
	// 결과 앞에 번호 붙이기 위한 변수
	private int count = 1;
	
	// 결과 저장
	public void save(String result) {
		Results += count + ". " + result + "\n"; 
		count++;
	}
	// 이전 결과 출력(저장된 결과가 있을 경우에만 출력)
	public void printAll() {
		if(Results.equals("")) {
			System.out.println("저장된 결과가 없습니다.");
		} else 
			System.out.println("------------- 이전 결과 -------------");
			System.out.println(Results);
			System.out.println("-----------------------------------");
		
	}
}
