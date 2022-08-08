import java.util.*;

public class Power {
    public static void main (String[] args) throws java.lang.Exception{

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
        
        int power = 1;
        for (int x = 1; x <= b; x++) {
            power = power * a;
        }
        System.out.println(power);
    }

    
}
