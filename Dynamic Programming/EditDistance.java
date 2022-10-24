public class EditDistance {
    // recursive
    public static int editDistance(String s, String t) {
        if (s.length() == 0) {
            return t.length();
        }
        if (t.length() == 0) {
            return s.length();
        }

        if (s.charAt(0) == t.charAt(0)) {
            return editDistance(s.substring(1), t.substring(1));
        } else {
            // insert
            int op1 = editDistance(s, t.substring(1));
            // deletion
            int op2 = editDistance(s.substring(1), t);
            // subsitute or replace
            int op3 = editDistance(s.substring(1), t.substring(1));
            return 1 + Math.min(op1, Math.min(op2, op3));
        }

    }

    public static int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(m - i) == t.charAt(n - j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[m][n];
    }

}
