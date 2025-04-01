package project0401;

public class Car2 {
	int gas;

    void setGas(int x) {
        gas = x;
    }

    boolean isLeftGas() {
        if (gas <= 0) {
            System.out.println("gas가 없습니다.");
            return false;
        } else {
            System.out.println("gas가 있습니다.");
            return true;
        }
    }
    void run() {
    	while (gas > 0 ) {
    		System.out.print("달립니다. ");
    		System.out.println("(잔량 : " + gas + ")");
    		gas--;
    		if(gas==0) {
    			System.out.println("멈춥니다. (잔량 : " + gas + ")");
    	    	return;
    		}
    	}
    }
}

