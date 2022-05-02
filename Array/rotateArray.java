import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  public static void reverse(int[] a, int i, int j) {
  
    while (i < j) {         
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
      i++;
      j--;
    }

  }

  public static void rotate(int[] a, int k) {
    k = k % a.length;         //if k (number of rotation) is greater than length of array  we will modulus it with length of array 
    if (k < 0) {             //if k (number of rotation) is negative than we will add length  of array
      k = k + a.length;
    }
    reverse(a, 0, a.length - k - 1);                  //reversing part1
    
    reverse(a, a.length - k, a.length - 1);           //reversing part 2
                                
    reverse(a, 0, a.length - 1);                        //reversing whole array

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
  }

}
