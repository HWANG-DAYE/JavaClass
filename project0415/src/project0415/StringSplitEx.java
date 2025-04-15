package project0415;

public class StringSplitEx {
	public static void main(String[] args) {
		String text = "아이유&이지은,이지안,오애순-양금명";
		String[] names = text.split(",|-|&");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
