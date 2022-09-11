
import java.util.*;

public class pairWithDiffK {
    public static int countPairsWithDiffK(int[] nums, int n, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (k < 0)
            return 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);// adding all the elements in hashmao
        }
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) > 1) {// if k ==0 then we will check frequency of element if it is greater than 1
                                       // means we find antoher similar number whose subtraction result will 0
                    count++;
                }
            } else if (map.containsKey(key + k)) {// else if our map contains elemnt + k then we will find a pair
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        System.out.println(countPairsWithDiffK(arr, arr.length, 0));
    }
}
