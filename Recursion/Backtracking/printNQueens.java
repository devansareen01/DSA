import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[][] = new int [n][n];
    printNQueens(arr, "", 0);

  }

  public static void printNQueens(int[][] chess, String qsf, int row) {
    if (row == chess.length ) {
      System.out.println(qsf + ".");
      return;

    }
    for (int col = 0; col < chess.length; col++) {
      if (isQueenSafe (chess, row, col) == true) {
        chess[row][col] = 1;
        printNQueens(chess, qsf + row + "-" + col + "," + " ", row + 1);
        chess[row][col] = 0;
      }
    }
  }

  public static boolean isQueenSafe(int[][]chess, int row, int col) {

    //firstly we will check left diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }

    //secondaly  we will check vertically
    for (int i = row - 1, j = col; i >= 0; i--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }


    //on last we will check right diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
      if (chess[i][j] == 1) {
        return false;
      }
    }
    return true;
  }





}
