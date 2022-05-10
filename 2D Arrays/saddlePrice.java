import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn .nextInt();
    int arr[][] = new int [n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }



    int min = 0;
    for (int i = 0; i < n; i++) {
      min = arr[i][0];
      int coln = 0;
      for (int j = 0; j < n; j++) {
        if (min > arr[i][j]) {
          min = arr[i][j];
          coln = j;
        }
      }
      //   System.out.println(min);
      //   System.out.println(coln);



      boolean flag = true;
      for (int k = 0; k < n; k++) {
        if (min < arr[k][coln]) {
          flag = false;
          break;
        }

      }




      if (flag == true) {
        System.out.print(min);
        return;
      }
    }
    System.out.print("Invalid input");
  }

}
