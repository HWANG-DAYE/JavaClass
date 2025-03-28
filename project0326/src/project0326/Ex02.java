package project0326;

public class Ex02 {
	public static void main(String[] args) {
		
	int numOfApples = 165;
	int sizeOfBucket = 10;
	int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket==0 ? 0 : 1);
	
	System.out.println("필요한 바구니의 수 : " + numOfBucket);
	
	}
}
