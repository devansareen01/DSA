import java.lang.Enum.EnumDesc;
import java.util.Scanner;

public class binarysearch {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();

        }
        return input;
    }

    public static int binarySearch(int input[], int find) {
        int start = 0;

        int end = input.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (input[mid] == find)
                return mid;
            if (input[mid] < find)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(binarySearch(arr, k));

    }
}
