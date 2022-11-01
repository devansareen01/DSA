public class TransactionWithFee {
    public static int maximumProfit(int arr[], int fee) {
        int obsp = -arr[0];// old bought state profit we have 0 ruppees 0-1day share is our obsp
        int ossp = 0;// old selling state profit
        for (int i = 1; i < arr.length; i++) {
            int nbsp = 0;
            int nssp = 0;
            if (ossp - arr[i] > obsp) {
                nbsp = ossp - arr[i];
            } else {
                nbsp = obsp;
            }
            if (obsp + arr[i] - fee > ossp) {
                nssp = obsp + arr[i] - fee;
            } else {
                nssp = ossp;
            }
            ossp = nssp;
            obsp = nbsp;
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
        int fee = scn.nextInt();
        System.out.println(maximumProfit(prices, fee));
    }

}
