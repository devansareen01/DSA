import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in);
    int row1 = scn.nextInt();
    int col1 = scn.nextInt();
    int arr1[][] = new int[row1][col1];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = -0; j < arr1[0].length; j++) {
        arr1[i][j] = scn.nextInt();
      }
    }
    int row2 = scn.nextInt();
    int col2 = scn.nextInt();
    int arr2[][] = new int[row2][col2];
    for (int i = 0; i < arr2.length; i++) {
      for (int j = -0; j < arr2[0].length; j++) {
        arr2[i][j] = scn.nextInt();
      }
    }
    if (col1 != row2) {
      System.out.println("Invalid input");
      return;
    }
    int ans[][] = new int[row1][col2];
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col2; j++) {
        for (int k = 0; k < col1; k++) {
          ans[i][j] += (arr1[i][k] * arr2[k][j]);
        }
      }
    }

    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }

  }

}
