package project0401;

import java.util.Calendar;

public class Time {
	int h;
	int m;
	int s;
	
	Calendar now = Calendar.getInstance();
	int currentH() {
		h = now.get(Calendar.HOUR);
		return h;
	}
	int currentM() {
		m = now.get(Calendar.MINUTE);
		return m;
	}
	int currentS() {
		s = now.get(Calendar.SECOND);
		return s;
	}
}
