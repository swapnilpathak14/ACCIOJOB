import java.util.*;


public class LargeEleRemove {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = sc.nextInt();
        }
        int temp = 0;
        

        int[] second = new int[arr.length - 1]; // Created another array
        int maxidx = 0;
        sc.close();
        
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
        for (int y = 0; y < n - 1; y++) {
            // ans=Math.max(second[y],ans);
            System.out.print(second[y] + " ");
        }
        System.out.println();

    }
}
