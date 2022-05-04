import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    int limit = (int)Math.pow(2, arr.length);   //length will become 2^3
    for (int i = 0; i < limit; i++) {
      int temp = i;
      String ans = "";          //delaring string for storing answer
      for (int j = arr.length - 1; j >= 0; j--) {
        int rem = temp % 2;             //converting to binary
        temp = temp / 2;
        if (rem == 0) {
          ans = "-\t" + ans;        //if number is 0 then we will print - else our subset 
        } else {
          ans = arr[j] + "\t" + ans;
        }
      }
        System.out.println(ans);
    }
  
  }

}
