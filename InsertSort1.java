import java.util.Scanner;


public class InsertSort1 {
    public static void insertIntoSorted(int[] arr) {
        int n = arr.length;
        int element = arr[n - 1];
        for (int x = n-2; x>=0; x--) {
            if (arr[x] > element) {
                arr[x+1] = arr[x];
                printArray(arr);

            } else {
                arr[x + 1] = element;
                printArray(arr);
                break;
            }
            if ((x == 0) && (arr[x] > element)) {
                arr[x] = element;
                printArray(arr);
            }
        }

    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        insertIntoSorted(arr);
        sc.close();
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
