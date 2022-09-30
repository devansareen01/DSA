public class fibonacciDP {
    public static int fib(int n) {
        int storage[] = new int[n + 1];
        storage[0] = 0;
        storage[1] = 1;
        for (int i = 2; i < storage.length; i++) {
            storage[i] = storage[i - 1] + storage[i - 2];
        }
        return storage[n];

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
