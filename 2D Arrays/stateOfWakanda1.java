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
        arr[i][j] = scn.nextInt();                  //taking input
      }
    }
    int j = 0;
    while (j < arr[0].length) {
      if (j % 2 == 0) {                         //if jth index is even we will print from 0th index to last index other wise we print last to 0 th index
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i][j]);
        }
        j++;
      }else{
          for(int i =arr.length-1;i>=0;i--){
              System.out.println(arr[i][j]);
          }
          j++;
      }

    }
  }

}

