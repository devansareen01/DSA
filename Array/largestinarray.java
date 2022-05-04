import java.util.Scanner;

public class largestinarray {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = s.nextInt();
        System.out.println("Enter elements");
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();

        }
        return input;
    }

    public static int largestInArray(int input[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }

        }
        if (largest == secondLargest || secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int n = arr.length;
        int secondLargest = findSecondLargest(n, arr);

        System.out.println("Second largest element in this array is :" + secondLargest);
    }

}
