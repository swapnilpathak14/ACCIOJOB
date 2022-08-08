import java.util.*;



public class LargestEleIdx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      int[] arr=new int[n];

      for(int x=0;x<n;x++){
        arr[x]=sc.nextInt();
      }
      
      sc.close();
      int key=0;
      for(int x=0;x<arr.length;x++){
        if(arr[x]>arr[key]){
            key=x;
        }
        
      }
      for (int x = 0; x < arr.length; x++){
          if (key != x && arr[key] < 2 * arr[x]){
            System.out.println("-1");
          }
              
        }
	}
}
