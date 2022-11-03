//the written function both prints and returns the output for the required question

import java.io.*;

class IRONMAN {
    
    public static int[] findTheRange(int l, int[][] a){
        
        int ans[] = new int[3];
        
        int p[] = new int[l];
        
        for(int i=0; i<a.length; i++){
            for(int j=a[i][0]; j<a[i][1]; j++){
                p[j] += a[i][2];
            }
        }
        
        int max = Integer.MIN_VALUE;                            // here we calculated the maximum value for final result
        int mi = 0;
        
        for(int k = 0; k<p.length; k++){
            if(p[k] > max){
                max = p[k];
                mi = k;
            }
        }
        
        ans[0] = mi;
        ans[1] = mi+1;
        ans[2] = max;
        
        System.out.print("[" + mi + ", " + (mi+1) + ", " + max + "]");
        System.out.println();
        
        return ans;
    }
    
	public static void main (String[] args) {
	    
	    int[][] a = {{2, 4, 5}, {1, 3, 6}, {2, 4, 7}};
		int[] b = findTheRange(5, a);
		
		for(int l=0; l<3; l++){
		    System.out.println(b[l]);
		}
	}
}
