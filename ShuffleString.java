import java.util.*;



public class ShuffleString {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String[] s=new String[n];

        for(int x=0;x<n;x++){
            s[x]=sc.next();
        }

        sc.close();

        for(int x=0;x<n;x++){
            System.out.println(s[x]);
        }

        

    }
}
