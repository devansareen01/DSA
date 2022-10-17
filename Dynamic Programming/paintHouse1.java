import java.util.Scanner;

public class paintHouse1 {
    public static void main(String[] args) throws Exception {
        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();//no. of houses
            int arr[][] = new int[n][3];
            for(int i =0;i<arr.length;i++){
                for(int j =0;j<arr[0].length;j++){
                    arr[i][j] = scn.nextInt();
                }
            }
            
            int dp[][] = new int[n][3];
            
            dp[0][0]  =arr[0][0];// at first house minimum will intial values
            dp[0][1] = arr[0][1];
            dp[0][2] = arr[0][2];
            
            for(int j =1;j<dp.length;j++){
                dp[j][0] = arr[j][0]+Math.min(dp[j-1][1],dp[j-1][2]);//at second house we cannnot choose red again we will choose remaning Previous minimum
                 dp[j][1] = arr[j][1]+Math.min(dp[j-1][0],dp[j-1][2]);//at third house we cannnot choose green again we will choose remaning Previous minimum
                  dp[j][2] = arr[j][2]+Math.min(dp[j-1][0],dp[j-1][1]);//at fourth house we cannnot choose blue again we will choose remaning Previous minimum
            }
            
            
            System.out.println(Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2])));
        }
    }
}
