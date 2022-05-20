import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    ArrayList<String> ans = getMazePaths(1, 1, n, m);
    System.out.println(ans);
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    //base case
    if (sr == dr && sc == dc) {
      ArrayList<String> BaseRes = new ArrayList<>();
      BaseRes.add("");
      return BaseRes;
    }
    // else if (sr > dr || sc > dc)
    // {
    //   ArrayList< String> bres = new ArrayList< >();
    //   return bres;
    // }


    ArrayList<String> result = new ArrayList<>();


    //horizontal moves
    for (int ms = 1; ms <= dc - sc; ms++) { // ms stands for moves size

      ArrayList<String>Hpaths = getMazePaths(sr, sc + ms, dr, dc);

      for (String path : Hpaths) {

        result.add("h" + ms + path);
      }
    }

    //vertical moves
    for (int ms = 1; ms <= dr - sr; ms++) { // ms stands for moves size

      ArrayList<String>Vpaths = getMazePaths(sr + ms, sc, dr, dc);

      for (String path : Vpaths) {

        result.add("v" + ms + path);
      }
    }

    //diagonal moves

    for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) { // ms stands for move size
      
      ArrayList<String>Dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);

      for (String path : Dpaths) {

        result.add("d" + ms + path);

      }
    }
    return result;

  }

}
