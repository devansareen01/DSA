public class fibonacciM {
    public static int fibM(int n) {
        int storage[] = new int[n + 1];// memoization array
        for (int i = 0; i < storage.length; i++) {
            storage[i] = -1;
        }
        return fibM(n, storage);
    }

    private static int fibM(int n, int[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = n;
            return storage[n];
        }
        if (storage[n] != -1) {
            return storage[n];
        }

        storage[n] = fibM(n - 1, storage) + fibM(n - 2, storage);// storing the result for nth call to reduce redundant
                                                                 // calls
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fibM(n));

    }
}