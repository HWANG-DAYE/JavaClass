package project0409;

class Buyer{
	int money = 1000; // 현재 가진 돈
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // 현재 카트위치를 저장하고 있는 변수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여" + p + "을/를 살 수 없습니다.");
			return;
		}
		money = money - p.price;
		add(p);
	}

	void add(Product p) {
		if(i>=cart.length) {
		Product[] tmp = new Product[cart.length*2];
		System.arraycopy(cart, 0, tmp, 0,  cart.length);
		cart = tmp;
	}
	cart[i] = p;
	i++;
}

	void summary() {
		String list = "";
		int m = 0;
		for(Product p : cart) {
			list = list + p.toString() + ", ";
			m += p.price;
		}
		System.out.println("구입한 물건 : " + list);
		System.out.println("사용한 금액 : " + m);
		System.out.println("남은 금액 : " + money);
	}
}

class Product{
	int price; // 제품의 가격
	Product(int price){
		this.price = price;
	}

}

class Tv extends Product{
	Tv(){super(100);}
	public String toString() {return "TV";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}
public class Test {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}
