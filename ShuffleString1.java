

import java.util.*;

public class ShuffleString1 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();

        int[] arr=new int[n];

        for (int x = 0; x < n; x++) {
            arr[x] = sc.nextInt();
        }

        sc.close();
        char[] cr=new char[n];
        for (int x = 0; x < n; x++) {
            cr[arr[x]]=s.charAt(x);
            //arr[x] //s.charAt(x)
        }

        //String ans=new String(cr);
        System.out.print(cr);

    }
}
