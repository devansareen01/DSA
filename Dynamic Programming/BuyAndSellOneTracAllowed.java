import java.io.*;
import java.util.*;

public class BuyAndSellOneTracAllowed {
    public static int maximumProfit(int prices[]) {
        int lsf = Integer.MAX_VALUE;// least so far
        int psit = 0;// profit if sell today
        int op = 0;// overall profit
        for (int i = 0; i < prices.length; i++) {
            if (lsf > prices[i]) {// if current price is less than perivous ones update lsf
                lsf = prices[i];
            }

            psit = prices[i] - lsf;// current price minus least price is our profit of current day
            if (op < psit) {
                op = psit;
            }
        }
        return op;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();

        }
        System.out.println(maximumProfit(prices));
    }
}
