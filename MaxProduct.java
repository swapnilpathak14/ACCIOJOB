import java.util.*;
public class MaxProduct {
    public static int maxpro(int[] arr){
        int n=arr.length;
        int pro = 1;
        //int max=Integer.MIN_VALUE;
        for(int x=0;x<n;x++){
            //
            for(int y=x;y<n;y++){
                if (arr[y] < arr[x]) {
                    
                    int temp = arr[y];
                    arr[y] = arr[x];
                    arr[x] = temp;
                }
                
                

            }   
            
        }
        pro = (arr[n - 1] - 1) * (arr[n - 2] - 1); //Slow Solution
        
        return pro;

    }
    public static void main(String[] args) throws java.lang.Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = sc.nextInt();
        }

        sc.close();
        int pro=maxpro(arr);
        
        System.out.println(pro);

    }
    
}
