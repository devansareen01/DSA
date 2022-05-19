import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList<String> res = gss(str);
    System.out.println(res);

  }

  public static ArrayList<String> gss(String str) {
    if (str.length() == 0) {
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }
    
    
    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> smallAns = gss(ros);

    ArrayList<String> ans = new ArrayList<>();
    for (String rstr : smallAns) {
      ans.add("" + rstr);
    }
    
    for (String rstr : smallAns) {
      ans.add(ch + rstr);
    }
    return ans;

  }

}
