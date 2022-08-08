import java.util.*;
public class AngryProf {

    public static void Angryprof(int n, int[] arr, int k){
        int count=0;

        for(int x=0;x<arr.length;x++){
            if(arr[x]<=0){
                count++;
            }
        }
        if(count>=k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for (int x = 0; x < n; x++) {
                arr[x] = sc.nextInt();
            }

            

            Angryprof(n, arr, k);

            t--;

        }
        sc.close();
        
        

    }
    
}
