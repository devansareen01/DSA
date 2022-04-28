import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int res = 0;

        int pow = 1;
        int c = 0;
        while (n2 > 0) {
            int dig1 = n1 % 10;
            n1 = n1 / 10;
            int dig2 = n2 % 10;
            n2 = n2 / 10;
            int dig = 0;
            dig2 += c;

            if (dig2 >= dig1) {
                c = 0;
                dig = dig2 - dig1;

            } else {
                c = -1;
                dig = dig2 + b - dig1;
            }
            res += dig * pow;
            pow *= 10;
        }

        return res;

    }
}
