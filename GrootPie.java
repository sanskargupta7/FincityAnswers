import java.io.*;

class GrootPie {
    
    public static void findPies(int[] a, int s){
        
        int n = a.length;
        
        System.out.print("[");
        
        for(int i=0; i<n; i++){
            if((s-a[i]) > 0){
                s = s-a[i];
                System.out.print(i + ",");
            }else if((s-a[i]) == 0){
                s = s-a[i];
                System.out.print(i);
            }
        }
        System.out.print("]");
        System.out.println();
    }
    
    
	public static void main (String[] args) {
		int arr1[] = { 3, 5, 3, 2, 1 };
        int sum1 = 10;
        findPies(arr1, sum1);
        
        int arr2[] = { 1, 2, 3, 2, 1 };
        int sum2 = 6;
        findPies(arr2, sum2);
        
        int arr3[] = { 8, 4, 3, 2, 6, 5 };
        int sum3 = 6;
        findPies(arr3, sum3);
        
        
	}
}