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
    displayArr(arr, n - 1);
  }


  public static void displayArr(int[] arr, int idx) {
    if (idx < 0) {
      return;
    }

    displayArr(arr, idx - 1);
    System.out.println(arr[idx]);

  }

}
