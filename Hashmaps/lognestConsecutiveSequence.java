import java.util.HashSet;

public class lognestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int current_element = nums[i];// eg if we are looking for 3
            int previous_elemnt = nums[i] - 1;// we find if its predesscor is availble in set or not
            if (set.contains(previous_elemnt) == false) {// if previous is not availble
                while (set.contains(current_element)) {// we will find current element consecutive
                    current_element++;
                    count++;
                }
            } // if previous is present we will find element next prev
            ans = Math.max(ans, count);// and will return longest Consecutive sequence
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
        System.out.println(longestConsecutive(arr));
    }
}
