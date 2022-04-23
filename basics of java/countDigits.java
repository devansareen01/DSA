import java.util.*;

public class countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10; // every time of division with 10 reduces 1 digit
            count++;
        }
        System.out.println(count);
    }
}
