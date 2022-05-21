import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    printKPC(str, "");
  }

  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};//keypad codes

  public static void printKPC(String str, String asf) {
    if (str.length() == 0) {
      System.out.println(asf);
      return;
    }
    char ch = str.charAt(0);

    String roq = str.substring(1);

    String codesforch = codes[ch - '0'];

    for (int i = 0 ; i < codesforch.length(); i++) {

      char chop = codesforch.charAt(i);//chop stands for charater option
      printKPC(roq, asf + chop);
    }


  }

}
