import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    for (int i = 0; i < a1.length; i++) { //input of first array
      a1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int a2[] = new int [n2];
    for (int j = 0; j < a2.length; j++) { // input of 2nd array
      a2[j] = scn.nextInt();
    }
    int sum[] = new int[n1 > n2 ? n1 : n2];
    int i = n1 - 1;
    int j = n2 - 1;       
    int k = sum.length - 1;
    int c = 0;
    while (i >=0 || j >= 0) {
      int  d = c;                     
      if (i >= 0) {
        d += a1[i];
      }


      if (j >= 0) {
        d += a2[j];
      }

      c = d / 10;
      d = d % 10;
      sum[k] = d;

      i--;
      j--;
      k--;

    }
    if (c > 0) {
      System.out.println(c);
    }
    for (int val = 0; val < sum.length; val++) {
      System.out.println(sum[val]);
    }
  }

}
