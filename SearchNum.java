import java.util.*;

public class SearchNum {
    public static int searchnum(int n, int k, int[] arr){
        int idx=-1;
        int flag=0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == k) {
                idx = x;
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            return idx+1;
        }
        else{
            return idx;
        }

    }
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }
        //int idx = -1;

        
        System.out.println(searchnum(n, k, arr));
        
    }
    
}
