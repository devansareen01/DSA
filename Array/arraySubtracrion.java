import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();

    int a1[] = new int[n1];
    for (int i = 0 ; i < a1.length; i++) {
      a1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int a2[] = new int [n2];
    for (int i = 0; i < a2.length; i++) {
      a2[i] = scn.nextInt();
    }

    int diff[] = new int[n2];
    int c = 0;
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;

    while (k >= 0) {
      int dig = 0;
      int av1 = (i >= 0 ? a1[i] : 0);
      if (a2[j] + c >= av1) {
        dig = a2[j] + c - av1;
        c = 0;
      } else {
        dig = a2[j] + 10 + c - av1;
        c = -1;
      }
      diff[k] = dig;
      i--;
      j--;
      k--;
    }
    int index = 0;
    while (index < diff.length && diff[index] == 0) {
      index++;
    }

    while (index < diff.length) {
      System.out.println(diff[index++]);

    }
  }

}
