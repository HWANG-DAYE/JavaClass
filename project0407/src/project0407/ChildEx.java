package project0407;

public class ChildEx {
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		
//		자동 타입 변환
//		부모 클래스의 필드와 메소드 접근 가능
//		예외적으로는 자식 메소트가 오버라이딩 된 경우
//		자식 메소드 호출된
//		한줄로 작성하면
//		Parent2 parent2 = new Child2();
		Parent2 parent2 = child2;
		
		// 부모 메소드 호출됨
		parent2.method1();
		
		// 재정의 되었으므로 자식 메소드 호출됨
		parent2.method2();
		
		// parent2.method3(); (호출 불가능)
	}
}
