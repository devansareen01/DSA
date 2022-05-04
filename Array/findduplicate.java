import java.util.Scanner;

public class findduplicate {

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
        int size = input.length;
        int duplicate = 0;
        int i = 0;
        for (i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                if (input[i] == input[j]) {
                    duplicate = input[j];
                    System.out.print(duplicate + " ");
                }

            }

        }

    }
}
