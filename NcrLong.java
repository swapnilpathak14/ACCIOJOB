
import java.util.*;


public class NcrLong {

    public static long Combination(long n, long r) {
        long res = Facto(n) / (Facto(r) * Facto(n - r));
        return res;
    }

    public static long Facto(long n) {
        long ans = 1;
        for (int x = 1; x <= n; x++) {
            ans = ans * x;

        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long r = sc.nextInt();
        sc.close();

        long res = Combination(n, r);

        System.out.println(res);
    }
}