package project0407;

public class Poin3D extends Point {

	int z;
	
	@Override
	String getLocation() {
		return super.getLocation() + ", z : " +  z;
	}
}
