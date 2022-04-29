import java.util.*;
  
  public class Main{
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        if (sourceBase != 10) {
            n = getValueIndecimal(n, sourceBase);
        }
        if (destBase == 10) {
            System.out.println(n);
        }
        if (destBase != 10) {

            n = getValueInBase(n, destBase);
            System.out.println(n);

        }
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
