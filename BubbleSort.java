
import java.util.*;


public class BubbleSort {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }

        sc.close();

        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // swap(arr[j], arr[j + 1]);
                    counter++;
                }
            }

        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n - 1]);

    }
}