import java.util.*;

public class MaxProduct1 {
    public static int maxpro(int[] arr) {
        int n = arr.length;
        int pro = 1;
        // int max=Integer.MIN_VALUE;
        int temp = 0;

        int[] second = new int[arr.length - 1]; // Created another array
        int maxidx = 0;

        

        for (int x = 0; x < n; x++) {

            temp = Math.max(arr[x], temp);

            if (temp > arr[maxidx]) {
                maxidx = x;
            }

        }
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == maxidx) {
                continue;
            }

            // if the index is not
            // the removal element index
            second[k++] = arr[i];
        }
        int ans = Integer.MIN_VALUE; // OR ans=-10
        for (int y = 0; y < n - 1; y++) {
            ans = Math.max(second[y], ans);

        }
        
        pro = (ans-1)*(temp-1); // Slow Solution

        return pro;

    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = sc.nextInt();
        }

        sc.close();
        int pro = maxpro(arr);

        System.out.println(pro);

    }

}
