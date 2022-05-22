import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn  = new Scanner(System.in);
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
    if (sc > dc || sr > dr) {
      return;
    }
    if (sr == dr && dc == sc) {
      System.out.println(psf);
      return;
    }
    for (int ms = 1; ms <= dc - sc; ms++) {
      printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms); //horizontal moves
    }
    for (int ms = 1; ms <= dr - sr; ms++) {
      printMazePaths(sr + ms, sc, dr, dc, psf + "v" + ms); //verticall moves
    }

    for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
      printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms); //diagonally moves
    }
  }

}
