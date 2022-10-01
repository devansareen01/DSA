public class minCountOfSquares {
    public static int countOfSqaures(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int remaning = i - j * j;
                if (dp[remaning] < min) {
                    min = dp[remaning];
                }
            }
            dp[i] = min + 1;
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countOfSqaures(n));
    }
}
