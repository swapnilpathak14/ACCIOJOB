import java.util.*;
//GREEDY APPROACH
public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        int st = 0;
        int en=0;
        for(int i = 0;i<n;i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    st = i;
                    en = j;
                }
            }

            arr[0] = st;
            arr[1] = en;
            
        }

        return arr;

        
        
    }

    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target=sc.nextInt();
        int[] nums = new int[n];

        for (int x = 0; x < nums.length; x++) {
            nums[x] = sc.nextInt();
        }
        sc.close();

        int[] ans= twoSum(nums, target);
        

        for(int x=0;x<2;x++){
            System.out.print(ans[x]+" ");

        }
        //System.out.println(ans[]);
        

    }
}
    

