import java.lang.annotation.Retention;

public class minStep {
    static int step = 0;

    // recursive solution
    public static int minStep(int n) {

        if (n == 1) {
            return 0;
        }
        if (n % 3 == 0) {
            return minStep(n / 3) + 1;
        }
        if ((n - 1) % 3 == 0) {
            return minStep(n - 1) + 1;
        }
        if (n % 2 == 0) {
            return minStep(n / 2) + 1;
        }
        return minStep(n - 1) + 1;
    }

    // memoization technique
    public static int minStepM(int n) {
        int storage[] = new int[n + 1];
        return minStepM(n, storage);
    }

    private static int minStepM(int n, int[] storage) {
        if (n == 1) {
            storage[n] = 0;
            return storage[n];
        }
        if (storage[n] != 0) {
            return storage[n];
        }
        if (n % 3 == 0) {
            return minStepM(n / 3, storage) + 1;
        }
        if ((n - 1) % 3 == 0) {
            return minStepM(n - 1, storage) + 1;
        }
        if (n % 2 == 0) {
            return minStepM(n / 2, storage) + 1;
        }
        storage[n] = minStep(n - 1) + 1;
        return storage[n];
    }

    // DP
    public static int minStepDp(int n) {
        int storage[] = new int[n + 1];
        storage[1] = 0;

        for (int i = 2; i < storage.length; i++) {
            int min = storage[i - 1];
            if (i % 3 == 0) {
                if (min > storage[i / 3]) {
                    min = storage[i / 3];
                }
            }
            if (i % 2 == 0) {
                if (min > storage[i / 2]) {
                    min = storage[i / 2];
                }
            }
            storage[i] = min + 1;
        }
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(minStepDp(n));
        System.out.println(minStep(n));
        System.out.println(minStepM(n));

    }
}
