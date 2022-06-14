import java.util.Arrays;
import java.util.Scanner;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int res[] = twoSum(nums, target);
        System.out.println(res);
    }
}
