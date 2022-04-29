import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int res = 0;
        int pow = 0;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            res += dig * Math.pow(b, pow);
            pow++;
        }
        return res;
    }
}
