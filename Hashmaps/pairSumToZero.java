import java.util.ArrayList;
import java.util.HashMap;

public class pairSumToZero {
    static int count = 0;

    public static ArrayList<Integer> util(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i : arr) {
            int complment = map.getOrDefault(-i, 0);// we are adding negative of given number by this when we find positive of this number in our hashmap we can return it as pair
            if (complment > 0) {
                ans.add(i);
                ans.add(-i);
                count += complment;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return ans;

    }

    public static int ZeroPairSum(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> ans = util(arr);
        System.err.println(ans);
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(2);
        sum.add(1);
        sum.add(-2);
        sum.add(2);
        sum.add(3);
        System.out.println(ZeroPairSum(sum.size(), sum));
    }
}
