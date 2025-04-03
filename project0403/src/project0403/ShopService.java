package project0403;

public class ShopService {
	// 1. 외부에서 객체를 생성하지 못하도록 -> 생성할 때 호출을 하는 생성자 private
	private ShopService() {}
	
	// 2. 외부에 공개할 유일한 객체를 생성
	private static ShopService instance = new ShopService();
	
	// 3. 외부에서 사용할 수 있도록 메소드 제공
	public static ShopService getInsatance() {
		return instance;
	}
	
}
