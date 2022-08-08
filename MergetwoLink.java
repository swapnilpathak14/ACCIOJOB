

import java.util.*;


public class MergetwoLink {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        for (int x = 0; x < arr1.length; x++) {
            arr1[x] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for (int y = 0; y < arr2.length; y++) {
            arr2[y] = sc.nextInt();
        }
        sc.close();

        int arr3[] = new int[n1 + n2];

        // introducing two pointers
        int p = 0, q = 0, k = 0;

        // Condition 1
        while (p < n1 && q < n2) {
            if (arr1[p] < arr2[q]) {
                arr3[k] = arr1[p];
                p++;
                k++;
            } else {
                arr3[k] = arr2[q];
                q++;
                k++;

            }
        }

        // Condition 2
        while (p < n1) {
            arr3[k] = arr1[p];
            p++;
            k++;
        }

        // Condition 3
        while (q < n2) {
            arr3[k] = arr2[q];
            q++;
            k++;
        }
        for (int x = 0; x < n1 + n2; x++) {
            System.out.print(arr3[x] + " ");
        }
        System.out.println();
    }
}