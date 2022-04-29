import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    int indx = -1;
    int find = scn.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == find) {
        indx = i;
        break;

      }
    }

    System.out.println(indx);

  }

}
