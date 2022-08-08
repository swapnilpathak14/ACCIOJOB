import java.util.*;
public class TimeConv{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        

        for(int x=0;x<s.length();x++){
            String s1 = s.substring(0, 2);
            StringBuffer sb=new StringBuffer(s);

            int hour = Integer.parseInt(s1);

            if(s.charAt(x)=='P' && hour<12){
                hour=12+hour;
                sb.delete(8, 10);

                System.out.println(String.valueOf(hour)+sb.delete(0, 2));
            }

            else if (s.charAt(x) == 'P' && hour == 12) {
                hour = hour;
                sb.delete(8, 10);

                System.out.println(String.valueOf(hour) + sb.delete(0, 2));
            }

            else if (s.charAt(x) == 'A' && hour < 12) {
                hour = hour;
                sb.delete(8, 10);

                System.out.println(sb);
            }

            else if (s.charAt(x) == 'A' && hour ==12) {
                hour = 0;
                String z="0";
                StringBuilder sb1=new StringBuilder(z);

                sb1.append(sb);
                sb1.delete(9, 11);

                System.out.println(String.valueOf(hour) + sb1.delete(1, 3));
            }

        }

    }
}