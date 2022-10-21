import java.util.*;

import java.io.*;

public class LCS {

    public class Solution {
        public static int getLengthOfLCS(String str1, String str2) {
            int dp[][] = new int[str1.length() + 1][str2.length() + 1];// last column and row will have _ there fore lcs
                                                                       // will 0
            for (int i = dp.length - 2; i >= 0; i--) {
                for (int j = dp[0].length - 2; j >= 0; j--) {
                    char ch1 = str1.charAt(i);
                    char ch2 = str2.charAt(j);
                    if (ch1 == ch2) {// if the first characters of both strings are same then both strings losse
                                     // there one character
                        /// when both characters are same we move diagonally length of both the string
                        /// reduced by 1 as the first character of both strings are equal

                        dp[i][j] = 1 + dp[i + 1][j + 1];
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);// we take max bwtween the horizontal and
                                                                        // vertical elements
                    }
                }
            }
            return dp[0][0];
        }
    }
}
