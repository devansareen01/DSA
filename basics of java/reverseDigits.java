import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n > 0) {
            int last = n % 10;
            System.out.println(last);
            n = n / 10;
        }
    }
}
