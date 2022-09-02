import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.containsKey(arr[i]))
                continue;
            else {
                ans.add(arr[i]);
                seen.put(arr[i], true);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 3, 42, 1, 3, 2, 42, 2, 3 };
        ArrayList<Integer> ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}
