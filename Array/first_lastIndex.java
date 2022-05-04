import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int firstIdx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                firstIdx = mid;
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        int lastIdx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
            } else if (data < arr[mid]) {
                high = mid - 1;
            } else {
                lastIdx = mid;
                low = mid + 1;
            }
        }
        System.out.println(firstIdx);

        System.out.println(lastIdx);
    }

}
