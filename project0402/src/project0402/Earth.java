package project0402;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_SPACE_AREA ;

	static {
		EARTH_SPACE_AREA = 4* Math.PI * Math.pow(EARTH_RADIUS, 2);
	}
	
}
