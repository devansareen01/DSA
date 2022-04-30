import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();         // it will take input of array
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++)  {     // it will give us maximum element of array
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    for (int i = max; i >= 1; i--) {
      for (int j = 0; j < arr.length; j++) {  //now we compare maxmimum element with jth elment of array and if it is greater than or equal to max we will print * other wise blank
        if (arr[j] >= i) {              
          System.out.print("*\t");
        } else {
          System.out.print("\t");

        }
      }
      System.out.println();
    }
  }

}
