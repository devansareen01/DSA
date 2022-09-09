import java.util.ArrayList;
import java.util.HashMap;

public class intersectionOfArray {

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);// we are passing smallest array it will reduce our time complexity
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);// adding smallest array values in map
        }
        int k = 0;
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {// addimg common frequency elements
                nums1[k++] = i;// making our ans array
                map.put(i, 0);
            }
        }
        int ans[] = new int[k];
        for (int i = 0; i < ans.length; i++) {

            ans[i] = nums1[i];// copying element  to our final array
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        int arr2[] = { 2, 2 };
        int ans[] = intersection(arr, arr2);
        for (int i : ans) {
            System.out.println(i);
        }
    }

}
