import java.util.Scanner;

public class printDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String string_n = Integer.toString(n);
        for (int i = 0; i < string_n.length(); i++) {
            System.out.println(string_n.charAt(i));
        }
    }
}
