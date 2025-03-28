package project0328;

public class ArrayCopy {
	public static void main(String[] args) {
		String[] oldList = {"java", "array", "copy",};
		String[] newList = new String[5];
		
		System.arraycopy(oldList, 0, newList, 0, oldList.length);
		
		for(int i=0; i<newList.length; i++) {
			System.out.print(newList[i]+" ,");
		}
	}
}
