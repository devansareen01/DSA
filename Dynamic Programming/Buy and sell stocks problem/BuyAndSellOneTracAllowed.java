import java.io.*;
import java.util.*;
// package Buy and sell stocks problem;

public class BuyAndSellOneTracAllowed {
    public static int MaximumProfit(int prices[]) {
        int buy = 0;
        int sell = 1;
        int op = 0;// overall profit

        for (int i = 0; i < prices.length; i++) {
            if (prices[buy] < prices[sell]) {// we cannot buy if sell at lower amount of buying
                op += prices[sell] - prices[buy];

            }
            if (sell == prices.length - 1) {
                break;
            }

            buy++;
            sell++;
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
