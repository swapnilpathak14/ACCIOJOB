import java.util.*;


public class ReverseDigit {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10; // for every step we need a last digit
            reverse = reverse * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
