import java.io.*;

//Both the functions return the possible correct answer

class SupermanAndBottleCityOfKandor {
    
    //This function prints all the places where people can live
    /*public static void findPlanet(double[][][] a, double[] b){
        double min = b[0];
        double max = b[1];
        double sum;
        
        for(int i=0; i<a.length; i++){
            
            sum = 0;
        
            for(int j=0; j<a[i].length;j++){
                sum += a[i][j][0]/a[i][j][1];
            }
            
            if(sum<=max && sum>=min){
                System.out.println(i);
            }
        }
    }*/
    
    
    //This function returns the first habitable planet 
    public static int findPlanet(double[][][] a, double[] b){
        double min = b[0];
        double max = b[1];
        double sum;
        
        for(int i=0; i<a.length; i++){
            
            sum = 0;
        
            for(int j=0; j<a[i].length;j++){
                sum += a[i][j][0]/a[i][j][1];
            }
            
            if(sum<=max && sum>=min){
                return i;
            }
        }
        
        return -1;
    }
    
	public static void main (String[] args) {
		
		double[][][] a = {{{0.433, 200}}, {{0.89, 400}, {0.6, 300}}};
		double[] b = {0.003, 0.005};
		
		System.out.println(findPlanet(a, b));
		
	}
}
