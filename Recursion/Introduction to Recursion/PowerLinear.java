import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int x = scn.nextInt();
    System.out.println(power(n, x));
  }

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return power(x, n - 1) * x;
  }

}
