import java.io.*;
import java.util.*;

public class TransactionWithCoolDown {
    public static int maximumProfit(int arr[]) {
        int obsp = -arr[0];// old bought state profit,we have assumed that we have already buy on first day
        int ossp = 0;// old sold state profit
        int ocsp = 0;// old colldown state profit

        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            if (ocsp - arr[i] > obsp) {
                nbsp = ocsp - arr[i];
            } else {
                nbsp = obsp;
            }
            if (obsp + arr[i] > ossp) {
                nssp = obsp + arr[i];
            } else {
                nssp = ossp;
            }
            if (ocsp < ossp) {
                ncsp = ossp;
            } else {
                ncsp = ocsp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        return ossp;
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
