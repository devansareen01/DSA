import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    printMazePaths(1, 1, n, m, "");
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  //level and option trick
  public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
    if (sr > dr || sc > dc) {
      return;
    }
    if (sr == dr && sc == dc) {
      System.out.println(psf);
      return;
    }
    printMazePaths(sr, sc + 1, dr, dc, psf + "h");
    printMazePaths(sr + 1, sc, dr, dc, psf + "v");
  }

}
