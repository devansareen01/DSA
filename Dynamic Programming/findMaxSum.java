public class findMaxSum {
    public static int findMaxSum(int arr[], int n) {
        int inc = arr[0];// we include previous exclude and self
        int exc = 0;// and we exclude maxmimum of previous exclude and include
        for (int i = 1; i < n; i++) {
            int newinc = exc + arr[i];
            int newexc = Math.max(exc, inc);

            inc = newinc;
            exc = newexc;
        }

        return Math.max(inc, exc);

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findMaxSum(arr, n));
    }
}
