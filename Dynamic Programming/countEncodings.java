import java.util.Scanner;

public class countEncodings {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int[] dp = new int[str.length()];
        dp[0] = 1;// at first index every single character can have one way to decode only that is
                  // itself
        for (int i = 1; i < dp.length; i++) {
            if (str.charAt(i - 1) == '0' && str.charAt(i) == '0') {// 1st case (both side zeros): if both left and right
                                                                   // character will contain zero then can neither call
                                                                   // only with zero nor with both zeros so that index
                                                                   // will cotain zero ways to decode
                dp[i] = 0;
            } else if (str.charAt(i - 1) == '0' && str.charAt(i) != '0') { // 2nd case(zero and non zero): if string is
                                                                           // 21103 i can split it as 2110-3 cannot
                                                                           // split as 211-03 so it contain only 1 spilt
                                                                           // that is dp[i-1]
                dp[i] = dp[i - 1];
            } else if (str.charAt(i - 1) != '0' && str.charAt(i) == '0') {// 3rd case(non zero and zero): here we
                                                                          // cannot make single split(call) but we can
                                                                          // split it with two if it i s less than 26
                if (str.charAt(i - 1) == '1' || str.charAt(i - 1) == '2') {
                    dp[i] = i >= 2 ? dp[i - 2] : 1;
                } else {
                    dp[i] = 0;
                }
            } else {
                if (Integer.parseInt(str.substring(i - 1, i + 1)) <= 26) {// if doouble character code will less than
                                                                          // equal to 26 then this line will run
                    dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = dp[i - 1]; // single character call will iterate every time
                }
            }
        }
        System.out.println(dp[str.length() - 1]);
    }
}
