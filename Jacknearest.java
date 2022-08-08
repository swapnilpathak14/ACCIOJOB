public class Jacknearest {
    public static int JackNeigh(int arr[], int k){
        int n=arr.length;
        int idx=0;
        int ans=0;

        int st=0;
        int en=n-1;

        int temp=0;
        int temp1=0;
        while(st<=en){
            if(arr[st]==k){
                temp=Math.abs(k-arr[st]);
                st++;
            }
            if(st==en){
               temp1=Math.abs(k-arr[en])
               en--; 
            }

        }
        for(int x=0;x<n;x++){
            while((k-arr[x]!=0)){

            }
        }
    }
    public static void main(String[] args) throws java.lang.Exception{

    }
    
}
