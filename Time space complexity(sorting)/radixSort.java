import java.io.*;

import java.util.*;

public class radixSort {

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // step1-->find max in array
                max = arr[i];
            }
        }

        int exp = 1;
        while (exp <= max) { // step2-->apply count sort while exponent is less than max
            countSort(arr, exp);
            exp *= 10;
        }
    }

    public static void countSort(int[] arr, int exp) {

        int[] ans = new int[arr.length];

        int[] farr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            farr[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < farr.length; i++) {
            farr[i] += farr[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int pos = farr[(arr[i] / exp) % 10] - 1;
            ans[pos] = arr[i];
            farr[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
}