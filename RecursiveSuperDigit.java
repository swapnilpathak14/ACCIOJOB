import java.util.*;
public class RecursiveSuperDigit {

    public static String SuperDigit(String n){
        if(n.length()==1){
            return n;
        }
        long sum=0;
        for(int x=0;x<n.length();x++){
            sum += Integer.valueOf(String.valueOf(n.charAt(x)));
        }
        n = Long.toString(sum);
        return SuperDigit(n);
    }

    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
      int temp = sc.nextInt();
      String n = Integer.toString(temp);
      int k = sc.nextInt();
      String s = new String("");
      sc.close();
      for(int i = 0;i<k;i++){
        s+=n;
        }
      System.out.println(SuperDigit(s));
      //LOGIC NOT CORRECT

    }
    
}
