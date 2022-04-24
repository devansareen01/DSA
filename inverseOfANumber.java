import java.util.Scanner;

public class inverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int power = 1;
        int inverted = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            inverted += power * (Math.pow(10, digit - 1));
            power++;
        }
        System.out.println(inverted);
    }
}
