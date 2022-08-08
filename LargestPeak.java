import java.util.*;

public class LargestPeak {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }

        sc.close();
        int key = -1;
        int temp=-1;
        int idx=-1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > key) {
                temp = key;
                key = arr[x];
                idx = x;
            } else if (arr[x]>temp) {
                temp = arr[x];
            }


        }
            
        
        if(temp>=2*key){
            System.out.println(idx);
        }

        else {
            System.out.println("-1");
        }

    }
}
