import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int x = scn.nextInt();
    int ans = firstIndexOccurance(arr, x);
    System.out.println(ans);

  }

  public static int firstIndexOccurance(int [] arr, int x) {
    return  firstIndex( arr,  0,  x);
  }

  private static int firstIndex(int[] arr, int idx, int x) {
    if (arr[idx] == x) {
      return idx;
    }
    if (idx == arr.length - 1) {
      return -1;
    }
    return firstIndex( arr,  idx + 1,  x);

  }

}
