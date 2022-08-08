import java.util.*;



public class BillDivision {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int item=sc.nextInt();
        int[] arr=new int[n];

        for(int x=0;x<n;x++){
            arr[x]=sc.nextInt();
        }
        int ex=sc.nextInt();

        sc.close();

        int sum=0;
        for(int x=0;x<n;x++){
            
            sum+=arr[x];
        }
        

        int ans=(sum-arr[item])/2;
      int diff=ex-ans;

        if(ans==ex){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(diff);
        }
        

    }
}