package project0414;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		System.out.println("obj1 해쉬코드 : " + obj1.hashCode());
		System.out.println("obj2 해쉬코드 : " + obj2.hashCode());
		System.out.println("obj3 해쉬코드 : " + obj3.hashCode());
	
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다.");
		}
		else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동일합니다.");
		}
		else {
			System.out.println("obj1과 obj3는 동일하지 않습니다.");
		}
	}
}
