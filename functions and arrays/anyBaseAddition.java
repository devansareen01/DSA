import java.util.Scanner;

public class anyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
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