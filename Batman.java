//The number of steps Batman has to make is equal to number to steps taken by the last prisoner

import java.io.*;

class BATMAN {
    
    public static int findNumOfStepsRequired(int np, int ps1){
        return np*ps1;
    }
     
    public static void main (String[] args) {
	System.out.println(findNumOfStepsRequired(3, 10));
		
    }
}
