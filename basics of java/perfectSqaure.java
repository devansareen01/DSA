import java.util.*;

public class perfectSqaure {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n = scn.nextInt();
        double sqr = Math.sqrt(n);
        if (sqr * sqr == n) {
            System.out.println("Perfect sqaure");
        } else {
            System.out.println("Not a perfect sqaure");
        }
    }
}
