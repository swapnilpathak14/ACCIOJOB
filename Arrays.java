

import java.util.*;
public class Arrays {
    
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        

        for(int x=0;x<n;x++){
            arr[x]=sc.nextInt();
        }
        sc.close();
        for(int x=0;x<n;x++){
            System.out.print(arr[x]+" ");
        }
        
    }
}
