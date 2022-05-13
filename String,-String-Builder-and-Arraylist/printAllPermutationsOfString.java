import java.io.*;
import java.util.*;

public class Main {

  public static void solution(String str) {
    // write your code here
    int n = str.length();
    int f = fact(n);

    for (int i = 0; i < f; i++) {
      StringBuilder sb = new StringBuilder(str);
      int temp = i;
      for (int div = n; div >= 1; div--) {
        int q = temp/div;
        int r =temp%div;

        System.out.print(sb.charAt(r));
        sb.deleteCharAt(r);

        temp = q;

      }
      System.out.println();
    }


  }


  public static int fact(int n ) {
    int ans = 1;
    for (int i = 2; i <= n; i++) {
      ans *= i;
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}
