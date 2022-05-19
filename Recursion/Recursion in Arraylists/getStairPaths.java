import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<String> ans = getStairPaths(n);
    System.out.println(ans);

  }

  public static ArrayList<String> getStairPaths(int n) {
    if (n == 0) {
      ArrayList<String> baseRes = new ArrayList<>();
      baseRes.add("");
      return baseRes;
    } else if (n < 0) {
      ArrayList<String> baseRes = new ArrayList<>();
      return baseRes;
    }
    ArrayList<String> path1 = getStairPaths(n - 1);
    ArrayList<String> path2 = getStairPaths(n - 2);
    ArrayList<String> path3 = getStairPaths(n - 3);

    ArrayList<String> paths = new ArrayList<>();
    for (String path : path1) {
      paths.add(1 + path);      // path 1
    }
    for (String path : path2) {
      paths.add(2 + path);      //path2
    }
    for (String path : path3) {
      paths.add(3 + path);
    }                           //path3
    return paths;

  }

}
