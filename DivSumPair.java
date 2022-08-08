import java.util.*;
public class DivSumPair {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int count=0;

        int[] arr=new int[n];
        for(int x=0;x<n;x++){
            arr[x]=sc.nextInt();
        }

        for(int x=0;x<n;x++){
            for(int y=x+1;y<arr.length;y++){
                if((arr[x]+arr[y])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
