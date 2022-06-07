import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println(factorial(n));
  }

  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return factorial(n - 1) * (n);
  }

}
