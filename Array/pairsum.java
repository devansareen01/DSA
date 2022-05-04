import java.util.Scanner;

public class pairsum {
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

    public static void pairSum(int input[], int x) {
        int size = input.length;
        int res = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                if (input[i] + input[j] == x) {
                    count++;
                    res = count;
                }

            }

        }
        System.out.print("total pairs for sum x are :" + res);

    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        Scanner s = new Scanner(System.in);
        System.out.println("enter x(sum of pairs)");
        int x = s.nextInt();
        pairSum(arr, x);
    }
}
