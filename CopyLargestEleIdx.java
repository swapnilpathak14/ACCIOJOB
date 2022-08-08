import java.util.*;

public class CopyLargestEleIdx {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }

        sc.close();
        int key = 0;
        int temp = 0;
        int idx = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > key) {
                temp = key;
                key = arr[x];
                idx = x;
            } else if (arr[x] > temp) {
                temp = arr[x];
            }

        }

        if (temp * 2 > key) {
            System.out.println("-1");
        }

        else {
            System.out.println(idx);
        }

    }
}
