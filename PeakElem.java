import java.util.*;

public class PeakElem {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = -1;

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        sc.close();

        if (arr.length == 1) {
            System.out.println("0");
            return;
        }
        for (int x = 0; x < n; x++) {
            if(x==0){
                if(arr[x]>arr[x+1]){
                    ans=x;
                    break;
                }
            }
            
            else if(x==arr.length-1) {
                if(arr[x]>arr[x-1]) {
                ans = x;
                break;
                } 

            }
            else{
                if(arr[x] > arr[x + 1] && arr[x]>arr[x-1]){
                    ans=x;
                    break;
                }
                
            }
            
        }
        System.out.println(ans);

    }
    
}
