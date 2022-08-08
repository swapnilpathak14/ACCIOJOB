

import java.util.*;
public class jewelStone {

    public static int numJewelsInStones(String jewels, String stones) {
        char[] ch1 = new char[jewels.length()];
        char[] ch2 = new char[stones.length()];
        int count=0;
        for(int x=0;x<jewels.length();x++){
            ch1[x] = jewels.charAt(x);

        }
        for (int x = 0; x < stones.length(); x++) {
            ch2[x] = stones.charAt(x);

        }

        for(int y=0;y<ch2.length;y++){
            for(int j=0;j<ch1.length;j++){
                if(ch1[j]==ch2[y]){
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(); //jewels
        String s2=sc.next(); //stones
        sc.close();
        int count=numJewelsInStones(s1,s2);
        System.out.println(count);
    }
}
