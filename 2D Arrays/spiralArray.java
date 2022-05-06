import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int arr[][] = new int [n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    int minRow = 0;
    int minCol = 0;
    int maxRow = arr.length-1;
    int maxCol = arr[0].length-1;
    int tne = n * m;
    int count = 0;

    while (count < tne) {
      //left wall
      for (int i = minRow, j = minCol; i <= maxRow && count < tne; i++) {
        System.out.println(arr[i][j]);
        count++;
      }
      minCol++;
      //bottom wall
      for (int i = minCol, j = maxRow; i <= maxCol && count < tne; i++) {
        System.out.println(arr[j][i]);
        count++;
      }
      maxRow--;

      //rigth wall
      for (int i = maxRow, j = maxCol; i >= minRow && count < tne; i--) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxCol--;

      //top wall
      for (int i = maxCol, j = minRow; i >= minCol && count < tne; i--) {
        System.out.println(arr[j][i]);
        count++;
      }
      minRow++;



    }
  }



}
