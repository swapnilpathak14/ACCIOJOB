import java.util.*;


public class Combinator {
    
    public static int Combination(int n, int r) {
        int res = Facto(n) / (Facto(r) * Facto(n - r));
        return res;
    }

    public static int Facto(int n){
        int ans=1;
        for(int x=1;x<=n;x++){
            ans=ans*x;
            
        }
        return ans;
    }
    

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        
        int res = Combination(n, r);

        System.out.println(res);
    }
}
