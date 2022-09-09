import java.util.ArrayList;
import java.util.HashMap;

public class pairSumToZero {
    public static class pair {
        public int count;
        public ArrayList<Integer> ans;

    }

    public static pair util(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        pair output = new pair();
        output.ans = new ArrayList<>();
        output.count = 0;
        for (int i : arr) {
            int complment = map.getOrDefault(-i, 0);
            if (complment > 0) {
                output.ans.add(i);
                output.ans.add(-i);
                output.count += complment;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return output;

    }

    public static int ZeroPairSum(int n, ArrayList<Integer> arr) {
        int count = util(arr).count;
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
        ArrayList<Integer> sum1 = new ArrayList<>();
        sum1.add(1);
        sum1.add(2);
        sum1.add(3);
        sum1.add(4);
        sum1.add(5);
        System.out.println(ZeroPairSum(sum1.size(), sum1));

    }
}
