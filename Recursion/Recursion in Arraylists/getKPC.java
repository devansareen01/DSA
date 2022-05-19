import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList<String> ans = getKPC(str);
    System.out.println(ans);
  }

  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};//keypad codes




  public static ArrayList<String> getKPC(String str) {
    if (str.length() == 0) {
      ArrayList<String> baseRes = new ArrayList<>();
      baseRes.add("");
      return baseRes;
    }
    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> smallAns = getKPC(ros);


    ArrayList< String> mres = new ArrayList< >();

    String codeforch = codes[ch - '0'];

    for (int i = 0; i < codeforch.length(); i++) {
      char chcode = codeforch.charAt(i);
      for (String val : smallAns) {
        mres.add(chcode + val);
      }
    }
    return mres;
  }

}
