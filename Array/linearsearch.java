import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class linearsearch {
    public static int linearsearch(int arr[], int n) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                num = i;
            }

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(linearsearch(arr, k));
    }
}
