

import java.util.*;
//import java.lang.*;
import java.io.*;

public class SumArray {
    public static void main(String[] args) throws java.lang.Exception {
        // your code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        int sum = 0;
        sc.close();
        //int temp[] = new int[n];
        for (int x = 0; x < n; x++) {
            sum+=arr[x];

        }
        //System.out.println(Arrays.toString(temp).replace("[", " ").replace("]", " ").replace(",", " "));
        for(int x=0;x<n;x++){
            System.out.print(sum-arr[x]+" ");
        }
    }
}
