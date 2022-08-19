import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {        // formula of converting 2d array to 1 d array is ---->>> (i*2d.length+j)
    public static int kthSmallest(int[][] matrix, int k) {
        int[] oneDArray = new int[matrix.length * matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                oneDArray[(i * matrix.length) + j] = matrix[i][j];// convert 2d array into 1d array 
            }
        }
        Arrays.sort(oneDArray);// then sort 1 d array 
        return oneDArray[k - 1];
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(kthSmallest(arr, 2));
    }
}
