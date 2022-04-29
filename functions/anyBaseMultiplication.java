import java.util.Scanner;

public class anyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int res = 0;
        int pow = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int singleProduct = getSingleDigitSum(b, n1, d2);
            res = getSum(b, res, singleProduct * pow);
            pow *= 10;
        }
        return res;
    }

    public static int getSingleDigitSum(int b, int n1, int d2) {
        int res = 0;
        int c = 0;
        int pow = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int dig = d1 * d2 + c;
            c = dig / b;
            dig = dig % b;

            res += dig * pow;
            pow *= 10;

        }
        return res;
    }

    public static int getSum(int b, int n1, int n2) {
        int result = 0;
        int sum = 0;
        int carry = 0;
        int multiplier = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            sum = (dig1 + dig2 + carry);
            carry = sum / b;
            int value = sum % b;
            result += multiplier * value;
            multiplier *= 10;

            n1 /= 10;
            n2 /= 10;
        }
        return result;

    }
}
