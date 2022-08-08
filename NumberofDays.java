import java.util.*;


public class NumberofDays
{
  
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    sc.close();

      if(m%2!=0 || m==10 || m==12 || m==8){
        System.out.println("31");
      }
      else if(m==2){
        System.out.println("28");
      }
      else{
        System.out.println("30");
      }
    
	}
}