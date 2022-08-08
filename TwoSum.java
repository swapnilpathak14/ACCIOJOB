import java.util.*;

public class TwoSum {
    public static int[] twosum(int[] nums, int target){
        int n=nums.length;
        int st=0; //starting index pointer
        int en=n-1; //ending index pointer
        //int ans[]=new int[2]; //empty array
        //for(int x=0;x<ans.length;x++){
            

        //}
        while (st < en) {

            if (nums[st] + nums[en] == target) {
                //ans[x] = st;
                //ans[x + 1] = en;
                // cout<<st<<" "<<en<<endl;
                return new int[] { st, en };

            } else if (nums[st] + nums[en] > target)

            {

                en--;
            } else {

                st++;
            }

        }
        
        //return ans;
        return new int[] { 0, 0 };
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

        int[] ans= twosum(nums, target);
        

        for(int x=0;x<2;x++){
            System.out.print(ans[x]+" ");

        }
        //System.out.println(ans[]);
        

    }
    
}
