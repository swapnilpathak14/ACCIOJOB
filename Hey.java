
import java.util.*;


public class Hey {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        sc.close();
        for (int x = 0; x < s.length(); x++) {
            if(s.charAt(x)=='e'){
                count++;
            }

        }
        String ans="h";
        for(int x=0;x<2*count;x++){
            ans+="e";
        }
        ans+="y";
        System.out.print(ans);

    }
}
