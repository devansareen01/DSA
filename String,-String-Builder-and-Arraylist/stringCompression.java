import java.io.*;
import java.util.*;

public class Main {

  public static String compression1(String str) {
    // write your code here
    String res = "";
    int i = 0;
    
    
    for (i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        continue;
      }

      res += str.charAt(i);

    }

    if (i == str.length() - 1) {
      res += str.charAt(i);
    }

    return res;
  }
  
  

  public static String compression2(String str) {
    // write your code here
    String res = "";
    int i = 0;
    int count = 1;
    
    
    for (i = 0; i < str.length() - 1; i++) {

      if (str.charAt(i) == str.charAt(i + 1)) {
        count++;
        continue;
      }
      res += str.charAt(i);
      if (count > 1) {
        res += count;
      }
      count = 1;

    }
    
    

    if (i == str.length() - 1) {
      res += str.charAt(i);
      if (count > 1) {
        res += count;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }

}
