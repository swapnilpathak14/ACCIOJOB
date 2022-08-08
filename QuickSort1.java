import java.util.*;



public class QuickSort1 {
    

    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = sc.nextInt();
        }
        sc.close();
        // rearrange using naive partition
        quicksort(arr, 0, arr.length - 1);

        print(arr);
    }
}