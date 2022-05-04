import java.util.Scanner;

public class tripletsum {
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

    public static int tripletSumpair(int input[], int x) {
        int count = 0;
        for (int i = 0; i < input.length - 2; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    if ((input[i] + input[j]) + (input[k]) == x)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        int x = sc.nextInt();
        int res = tripletSumpair(arr, x);
        System.out.println(" Total pair for triplet sum " + x + " :" + res);
    }
}
