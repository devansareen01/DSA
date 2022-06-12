import java.io.*;
import java.util.*;

public class countSort {

    public static void countSort(int[] arr, int min, int max) {
        // write your code here
        int range = max - min + 1; // step1 -->Find range

        int farr[] = new int[range]; // step2-->make a frequency array of size range

        for (int i = 0; i < arr.length; i++) { // step3--> filing frequency array that how much times the ith value is
                                               // occuring
            int idx = arr[i] - min;
            farr[idx]++;
        }

        for (int i = 1; i < farr.length; i++) {
            farr[i] = farr[i] + farr[i - 1]; // step 3-->making prefix sum array for stable sorting
        }

        int ans[] = new int[arr.length]; // step 4-->filling the ans array (sorted)
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = farr[val - min] - 1;
            ans[pos] = arr[i];
            farr[val - min]--;
        }
        for (int i = 0; i < arr.length; i++) { // step 5-->filling the final array with the help of ans array
            arr[i] = ans[i];
        }

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }

}