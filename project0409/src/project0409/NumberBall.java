package project0409;

public class NumberBall {
	static private int cnt = 0;
	int[] pb = new int[3];
	
	static int cnt_up() {
		cnt++;
		return cnt;
	}
	
	int[] problem() {
		for(int i=0; i<pb.length; i++) {
			pb[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(pb[i] == pb[j]) {
					i--;
					break;
				}
			}
		}
		return pb;
	}
	
	int[] smae(int player[]) {
		int s = 0;
		int b = 0;
		int o = 0;
		for(int i=0; i<pb.length; i++) {
			for(int j=0; j<player.length; j++) {
				if(player[j] == pb[i]) {
					if(i==j) s++;
					else b++;
				}
			}
		}
		o = 3-(b+s);
		return new int[] {s,b,o};
	}
}
