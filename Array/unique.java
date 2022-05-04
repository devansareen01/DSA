import java.util.Scanner;

public class unique {
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

    public static void main(String[] args) {
        int input[] = takeInput();
        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j])
                    count++;

            }
            if (count == 1) {
                System.out.print(input[i] + " ");

            }
        }

    }
}
