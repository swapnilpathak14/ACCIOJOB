package Assignments;

import java.util.*;


public class PeakElement {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.close();
        int ans = -1;

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }

        

        for (int x = 0; x < n; x++) {
            if (arr[x] > arr[x + 1]) {
                ans = x;
                break;
            } else {
                System.out.println("-1");
            }
            System.out.println(ans);

        }
    }
    
}
