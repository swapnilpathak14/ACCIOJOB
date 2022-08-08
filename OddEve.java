import java.util.*;

public class OddEve {
    public static void Oddeve(int[] arr, int n){
        int even=0; //Counter
        int odd=0; //Counter

        for(int x=0;x<arr.length;x++){
            if(arr[x]%2==0){
                even++;
            }
            if(arr[x]%2!=0){
                odd++;
            }
        }
        
        if (even % 2 == 0 && odd % 2 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int x=0;x<n;x++){
            arr[x]=sc.nextInt();
        }

        sc.close();

        Oddeve(arr, n);

        

    }
    
}
