import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int pow = 1;
        int res = 0;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            res += dig * pow;
            pow = pow * 10;
        }

        return res;
    }
}
