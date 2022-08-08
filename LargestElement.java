import java.util.*;



public class LargestElement
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
      int temp=0; int idx=-1;
      for(int x=0;x<arr.length;x++){
        key=arr[x];
        temp=Math.max(key,temp);
        idx=x;
        
      }
      if (temp > 2 * key) {
          System.out.println(idx);
      } else {
          System.out.println("-1");
      }
	}
}
