import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn .nextInt();
    int m = scn.nextInt();
    ArrayList<String> ans = getMazePaths(1, 1, n, m);
    System.out.println(ans);
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sc == dc && sr == dr) {
      ArrayList<String>BaseRes = new ArrayList<>();
      BaseRes.add("");
      return BaseRes;
    }

    ArrayList<String> Hpaths = new ArrayList<>();
    ArrayList<String> Vpaths = new ArrayList<>();

    if (sc < dc) {
      Hpaths = getMazePaths(sr, sc + 1, dr, dc); //horizontal path
    }
    if (sr < dr) {
      Vpaths = getMazePaths(sr + 1, sc, dr, dc); //vertical path
    }

    ArrayList<String> result = new ArrayList<>();

    for (String hpath : Hpaths) {
      result.add('h' + hpath);
    }

    for (String vpath : Vpaths) {
      result.add('v' + vpath);
    }
    return result;
  }

}
