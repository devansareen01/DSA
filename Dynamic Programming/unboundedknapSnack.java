import java.util.Scanner;

public class unboundedknapSnack {
    public static int knapSack(int N, int W, int val[], int wt[]) {
        int dp[] = new int[W + 1];// every cell of dp store max value of ith capacity
        dp[0] = 0;// 0 bag capacity will store zero wt
        for (int cap = 1; cap <= W; cap++) {
            int max = 0;
            for (int i = 0; i < N; i++) {
                if (cap >= wt[i]) {
                    int rbagc = cap - wt[i];// remaining bag capacity
                    int rbagv = dp[rbagc];// remaining bag value
                    int tbagv = rbagv + val[i];// total bag value
                    if (tbagv > max) {
                        max = tbagv;
                    }
                }

            }
            dp[cap] = max;
        }
        return dp[W];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int vl[] = new int[n];
        for (int i = 0; i < n; i++) {
            vl[i] = scn.nextInt();
        }
        int wt[] = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(knapSack(n, cap, vl, wt));
    }
}
