import java.util.*;
import java.lang.*;
import java.io.*;

public class Autori
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String emp=""; //empty string
      

      emp+=s.charAt(0);

      for(int x=0;x<s.length();x++){
        if(s.charAt(x)=='-'){
          emp+=s.charAt(x+1);
        }
      }
      System.out.println(emp);
	}
}