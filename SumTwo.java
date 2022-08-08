import java.util.*;

public class SumTwo {

    //Decalre a function
    public static int SumTwoElem(int num1,int num2){
        int cal=num1+num2;
        return cal;
    }
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        sc.close();

        int sum=SumTwoElem(n1, n2);
        System.out.println(sum);
    }
}
