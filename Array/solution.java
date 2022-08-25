import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        // add your code here
        int i = 0;
        int count = 0;
        Arrays.sort(arr2);
        ArrayList<Integer> output = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            for (i = 0; i < n; i++) {
                count = 0;
                if (arr2[j] <= arr1[i]) {
                    count++;
                }

            }

            output.add(count);

        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 8, 7, 5, 1, };
        int arrr2[] = { 4, 48, 30, 1, 1, 5 };
        System.out.println(countEleLessThanOrEqual(arr1, arrr2, arr1.length, arrr2.length));
    }
}
