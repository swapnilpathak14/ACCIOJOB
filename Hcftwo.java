import java.util.*;


public class Hcftwo {

    public static int gcd(int n1, int n2){
        int result=Math.min(n1,n2);

        while(result>0){
            if(n1%result==0 && n2%result==0){
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        sc.close();

        int res=gcd(a,b);

        System.out.println(res);

    }
}