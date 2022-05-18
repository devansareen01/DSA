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
    int x = scn.nextInt();
    int ans = lastOccurence(arr, x);
    System.out.println(ans);
  }
  
  
  public static int lastOccurence(int []arr, int x) {
    return lastIndex(arr, 0, x);
  }
  
  
  
  private  static int lastIndex(int[] arr, int idx, int x) {
    if (idx == arr.length) {
      return -1;
    }

    int ans = lastIndex(arr, idx + 1, x);
    
    
    if (ans == -1) {
      if (arr[idx] == x) {
        return idx;
      } else {
        return -1;
      }

    }
    return ans;

  }

}
