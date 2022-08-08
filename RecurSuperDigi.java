import java.util.*;
public class RecurSuperDigi {
    
    static int superDigit(String number, int k) {
        if (number.length() > 1) {
            long sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Character.getNumericValue(number.charAt(i));
            }
            return superDigit(Long.toString(sum * k), 1);
        } else
            return Character.getNumericValue(number.charAt(0));

    }
    
    public static void main(String[] args) throws java.lang.Exception{
        //Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        

        

        System.out.println(superDigit(s, k));

    }

    
}
